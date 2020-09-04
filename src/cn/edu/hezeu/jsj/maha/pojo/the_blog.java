package cn.edu.hezeu.jsj.maha.pojo;

public class the_blog {
	private String blogTxt;

	@Override
	public String toString() {
		return "the_blog [blogTxt=" + blogTxt + "]";
	}

	public String getBlogTxt() {
		return blogTxt;
	}

	public void setBlogTxt(String blogTxt) {
		this.blogTxt = blogTxt;
	}

	public the_blog(String blogTxt) {
		super();
		this.blogTxt = blogTxt;
	}
	public the_blog(){}

}
