package model;

public class Usuario {
	private String name;
	private String followers;
	private String public_repos;
	
	public String getPublic_repos() {
		return public_repos;
	}

	public void setPublic_repos(String public_repos) {
		this.public_repos = public_repos;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFollowers() {
		return followers;
	}

	public void setFollowers(String followers) {
		this.followers = followers;
	}
	
	public String showProfile() {
		return "Nome: " + name 
				+ "\nQuantidade de repositórios: " + public_repos 
				+ "\nQuantidade de seguidores: " + followers;
	}
}
