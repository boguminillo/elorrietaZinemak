import java.time.LocalDate;

/**
 * Erabiltzailea
 */
public class Erabiltzailea {

	/** Erabiltzailearen login-a */
	private String login;
	/** Erabiltzailearen pasahitza */
	private String pasahitza;
	/** Erabiltzailearen izena */
	private String izena;
	/** Erabiltzailearen abizena */
	private String abizena;
	/** Erabiltzailearen jaiotze data */
	private LocalDate jaiotzeData;
	/** Erabiltzailearen funtzioa */
	private Funtzioak funtzioa;

	/**
	 * Eraikitzaile hutsa
	 */
	public Erabiltzailea() {
		this.login = "";
		this.pasahitza = "";
		this.izena = "";
		this.abizena = "";
		this.jaiotzeData = LocalDate.now();
		this.funtzioa = Funtzioak.EMPLEADO;
	}

	/**
	 * Erabiltzailea
	 * 
	 * @param login       Erabiltzailearen login-a
	 * @param pasahitza   Erabiltzailearen pasahitza
	 * @param izena       Erabiltzailearen izena
	 * @param abizena     Erabiltzailearen abizena
	 * @param jaiotzeData Erabiltzailearen jaiotze data
	 * @param funtzioa    Erabiltzailearen funtzioa
	 */
	public Erabiltzailea(String login, String pasahitza, String izena, String abizena, LocalDate jaiotzeData,
			Funtzioak funtzioa) {
		this.login = login;
		this.pasahitza = pasahitza;
		this.izena = izena;
		this.abizena = abizena;
		this.jaiotzeData = jaiotzeData;
		this.funtzioa = funtzioa;
	}

	/**
	 * Erabiltzailearen login-a lortu
	 * 
	 * @return Erabiltzailearen login-a
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * Erabiltzailearen login-a ezarri
	 * 
	 * @param login Erabiltzailearen login-a
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	/**
	 * Erabiltzailearen pasahitza lortu
	 * 
	 * @return Erabiltzailearen pasahitza
	 */
	public String getPasahitza() {
		return pasahitza;
	}

	/**
	 * Erabiltzailearen pasahitza ezarri
	 * 
	 * @param pasahitza Erabiltzailearen pasahitza
	 */
	public void setPasahitza(String pasahitza) {
		this.pasahitza = pasahitza;
	}

	/**
	 * Erabiltzailearen izena lortu
	 * 
	 * @return Erabiltzailearen izena
	 */
	public String getIzena() {
		return izena;
	}

	/**
	 * Erabiltzailearen izena ezarri
	 * 
	 * @param izena Erabiltzailearen izena
	 */
	public void setIzena(String izena) {
		this.izena = izena;
	}

	/**
	 * Erabiltzailearen abizena lortu
	 * 
	 * @return Erabiltzailearen abizena
	 */
	public String getAbizena() {
		return abizena;
	}

	/**
	 * Erabiltzailearen abizena ezarri
	 * 
	 * @param abizena Erabiltzailearen abizena
	 */
	public void setAbizena(String abizena) {
		this.abizena = abizena;
	}

	/**
	 * Erabiltzailearen jaiotze data lortu
	 * 
	 * @return Erabiltzailearen jaiotze data
	 */
	public LocalDate getJaiotzeData() {
		return jaiotzeData;
	}

	/**
	 * Erabiltzailearen jaiotze data ezarri
	 * 
	 * @param jaiotzeData Erabiltzailearen jaiotze data
	 */
	public void setJaiotzeData(LocalDate jaiotzeData) {
		this.jaiotzeData = jaiotzeData;
	}

	/**
	 * Erabiltzailearen funtzioa lortu
	 * 
	 * @return Erabiltzailearen funtzioa
	 */
	public Funtzioak getFuntzioa() {
		return funtzioa;
	}

	/**
	 * Erabiltzailearen funtzioa ezarri
	 * 
	 * @param funtzioa Erabiltzailearen funtzioa
	 */
	public void setFuntzioa(Funtzioak funtzioa) {
		this.funtzioa = funtzioa;
	}

	@Override
	public String toString() {
		return login + ";" + pasahitza + ";" + izena + ";" + abizena + ";" + jaiotzeData + ";" + funtzioa + "\n";
	}

	/**
	 * Erabiltzailearen logina eta pasahitza fitxategian konprobatu eta beste datuak lortu
	 * 
	 * @return true logina ondo egin bada eta false errorerik egon bada
	 */
	public boolean login() {
		// TODO
		return true;
	}

	/**
	 * Erabiltzailea fitxategian gorde
	 * 
	 * @return true gorde bada eta false logina existitzen bada
	 */
	public boolean erregistratu() {
		// TODO
		return true;
	}
}
