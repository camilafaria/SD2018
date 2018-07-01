package teste;

import java.io.Serializable;

public class Localizacao implements Serializable {
	private int latitude;
	private int longitude;
	private String mensagem;

	public Localizacao(int latitude, int longitude, String msg) {
		this.latitude = latitude;
		this.longitude = longitude;
		this.mensagem = msg;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(int latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(int longitude) {
		this.longitude = longitude;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
}
