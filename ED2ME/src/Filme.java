
public class Filme implements Comparable<Filme> {
	private long id;
	private String nome;
	private byte avaliacao;

	public Filme() {
	}

	public Filme(final long id, final String nome, final byte avaliacao) {
		this.id = id;
		this.nome = nome;
		this.avaliacao = avaliacao;
	}

	@Override
	public int compareTo(final Filme o) {
		if (Long.compare(this.id, o.id) == 0) {
			return 0;
		}

		return this.nome.compareTo(o.nome);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Filme [id=" + id + ", nome=" + nome + ", avaliacao=" + avaliacao + "]";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + avaliacao;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Filme)) {
			return false;
		}
		final Filme other = (Filme) obj;
		if (avaliacao != other.avaliacao) {
			return false;
		}
		if (id != other.id) {
			return false;
		}
		if (nome == null) {
			if (other.nome != null) {
				return false;
			}
		} else if (!nome.equals(other.nome)) {
			return false;
		}
		return true;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(final long id) {
		this.id = id;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome
	 *            the nome to set
	 */
	public void setNome(final String nome) {
		this.nome = nome;
	}

	/**
	 * @return the avaliacao
	 */
	public byte getAvaliacao() {
		return avaliacao;
	}

	/**
	 * @param avaliacao
	 *            the avaliacao to set
	 */
	public void setAvaliacao(final byte avaliacao) {
		this.avaliacao = avaliacao;
	}

}
