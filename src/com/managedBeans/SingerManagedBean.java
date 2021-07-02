package com.managedBeans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "singerManagedBean")
public class SingerManagedBean {
	
	private String singer;
	private List<SongModel> songs;
	
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	
	public List<SongModel> getSongs() {
		return songs;
	}
	public void setSongs(List<SongModel> songs) {
		this.songs = songs;
	}
	public List<String> getSingers(){
		List<String> singers = new ArrayList<String>();
		singers.add("---Select Singer---");
		singers.add("Sarmad Sindhi");
		singers.add("Runa Laila");
		singers.add("Syed Suleman Shah");
		singers.add("Alan Faqeer");
		return singers;
	}
	public String submitData(){
		if(this.singer!=null){
			if(this.singer.equals("Sarmad Sindhi")){
				
				this.songs = new ArrayList<SongModel>();
				
				SongModel s = new SongModel();
				s.setSongId(1);
				s.setTitle("Allae cho awah ju akhyuu yad ayuu ");
				s.setUrl("https://www.youtube.com/embed/-Hotmp6ByT4");
				
				SongModel s1 = new SongModel();
				s1.setSongId(1);
				s1.setTitle("Suhra pehenjay akhyin khy jhall tuu ");
				s1.setUrl("https://www.youtube.com/embed/Xz3IOHLuHX4");
				
				SongModel s2 = new SongModel();
				s2.setSongId(1);
				s2.setTitle("Jar nazar lagi wae hin ghr jai baharun khy ");
				s2.setUrl("https://www.youtube.com/embed/QODO6eY0eZE");
				
				this.songs.add(s);
				this.songs.add(s1);
				this.songs.add(s2);
				
				System.out.println("Size        >>>>> "+this.songs.size());
			}
			else if(this.singer.equals("Runa Laila")){
				
				this.songs = new ArrayList<SongModel>();
				
				SongModel s = new SongModel();
				s.setSongId(1);
				s.setTitle("Song one ");
				s.setUrl("https://www.youtube.com/embed/hmg5_G6qbqg");
				
				SongModel s1 = new SongModel();
				s1.setSongId(1);
				s1.setTitle("Song two ");
				s1.setUrl("https://www.youtube.com/embed/5DoEJ-09DbA");
				
				SongModel s2 = new SongModel();
				s2.setSongId(1);
				s2.setTitle("Song three ");
				s2.setUrl("https://www.youtube.com/embed/7Na3yaPFG6s");
				
				this.songs.add(s);
				this.songs.add(s1);
				this.songs.add(s2);

			}
			else if(this.singer.equals("Syed Suleman Shah")){
				
				this.songs = new ArrayList<SongModel>();
				
				SongModel s = new SongModel();
				s.setSongId(1);
				s.setTitle("Song one ");
				s.setUrl("https://www.youtube.com/embed/96P-Irh7Ck4");
				
				SongModel s1 = new SongModel();
				s1.setSongId(1);
				s1.setTitle("Song two ");
				s1.setUrl("https://www.youtube.com/embed/9TSuo0EwxDw");
				
				SongModel s2 = new SongModel();
				s2.setSongId(1);
				s2.setTitle("Song three ");
				s2.setUrl("https://www.youtube.com/embed/CeWEQGIXxNg");
				
				this.songs.add(s);
				this.songs.add(s1);
				this.songs.add(s2);

			}
			else if(this.singer.equals("Alan Faqeer")){
				
				this.songs = new ArrayList<SongModel>();
				
				SongModel s = new SongModel();
				s.setSongId(1);
				s.setTitle("Song one ");
				s.setUrl("https://www.youtube.com/embed/5zywxwzBOg0");
				
				SongModel s1 = new SongModel();
				s1.setSongId(1);
				s1.setTitle("Huma huma bhatarii ");
				s1.setUrl("https://www.youtube.com/embed/eDU95VrP-cQ");
				
				SongModel s2 = new SongModel();
				s2.setSongId(1);
				s2.setTitle("Song three");
				s2.setUrl("https://www.youtube.com/embed/qXiGAVs7TxU");
				
				this.songs.add(s);
				this.songs.add(s1);
				this.songs.add(s2);
				
			}
			else{
				return "";
			}
		}
		
		return "";
	}

}
