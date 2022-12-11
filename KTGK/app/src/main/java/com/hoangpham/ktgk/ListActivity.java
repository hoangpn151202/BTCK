package com.hoangpham.ktgk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    ListView lvMusic;
    ArrayList<Music> arrayMusic;
    MusicAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        AnhXa();

        adapter = new MusicAdapter(this, R.layout.music_line, arrayMusic);
        lvMusic.setAdapter(adapter);
    }

    private void AnhXa(){
        lvMusic = (ListView) findViewById(R.id.MusicListView);
        arrayMusic = new ArrayList<>();

        arrayMusic.add(new Music(R.drawable.song_1,"Faded","Alan Walker","3:33"));
        arrayMusic.add(new Music(R.drawable.song_2,"Wake Me up","Avicii","4:33"));
        arrayMusic.add(new Music(R.drawable.song_3,"Old Town Road","Lil Nas X","2:38"));
        arrayMusic.add(new Music(R.drawable.song_4,"Believer","Imagine Dragons","3:36"));
        arrayMusic.add(new Music(R.drawable.song_5,"Closer","The Chainsmokers","4:21"));
    }
}