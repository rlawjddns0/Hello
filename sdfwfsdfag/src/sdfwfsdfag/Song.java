package sdfwfsdfag;


public class Song {
	String title;
	String article;
	String album;
	String[] composer;
	int year;
	int track;
	
	
	Song(String title,String article, String album, String []composer,int year,int track)
	{
		int len=composer.length;
		this.title=title;
		this.article=article;
		this.album=album;
		for(int i=0; i<composer.length; i++)
		    this.composer[i]=composer[i];
		this.year=year;
		this.track=track;
	}
	Song()
	{
		
	}
	
	void show()
	{
		System.out.println("제목:"+title);
		System.out.println("가수:"+article);
		System.out.println("엘범:"+album);
		    for(int i=0; i<composer.length;i++)
		      System.out.println("작고가:"+composer[i]);
		System.out.println("년도:"+year);
		System.out.println("트랙:"+track);
		
	}
	

}
