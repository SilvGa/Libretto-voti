package it.polito.tdp.libretto;

public class Voto implements Comparable<Voto>{
	
	private String nome;
	private int voto;
	
	//info temporali sono una rogna
	//private LocalDate data;
	
	
	
	public String getNome() {
		return nome;
	}
	public Voto(String nome, int voto) {
		super();
		this.nome = nome;
		this.voto = voto;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getVoto() {
		return voto;
	}
	public void setVoto(int voto) {
		//per gesiìtire i valori errati
		if(voto<18 || voto>34) {
			throw new IllegalArgumentException("Valore non ammesso");
		}
		this.voto = voto;
	}
	@Override
	public String toString() {
		return "Voto [nome=" + nome + ", voto=" + voto + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + voto;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Voto other = (Voto) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (voto != other.voto)
			return false;
		return true;
	}
	@Override
	public int compareTo(Voto v) {
		// TODO Auto-generated method stub
		return this.nome.compareTo(v.getNome());
	}
	

	
}
