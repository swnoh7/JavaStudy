package Question6;

public class MusicVO {
	
	//노래 제목을 저장할 필드
	String title;
	//가수 이름을 저장할 필드
	String singer;
	//노래길이를 저장할 필드
	int playTime;
	

	public MusicVO(String title, String singer, int playTime) {
		this.title = title;
		this.singer = singer;
		this.playTime = playTime;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getSinger() {
		return singer;
	}


	public void setSinger(String singer) {
		this.singer = singer;
	}


	public int getPlayTime() {
		return playTime;
	}


	public void setPlayTime(int playTime) {
		this.playTime = playTime;
	}
	
	
	
	
	
	
	
	
	
	
	
}
