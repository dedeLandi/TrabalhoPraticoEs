package br.ufscar.consulta;

import java.util.Date;

public class FeedbackData {

	public FeedbackData() {
		super();
	}

	private int idFeedback;
	private int avaliacao;
	private int tpFeedback;// finalizacao de projeto ou finalizacao de atividade
	private String observacoes;
	private boolean estado;	
	private Date ts;
	private ResponsavelData feedbackDe = null;
	private ResponsavelData feedbackPara = null;
	private ProjetoAtividadeData projetoAtividade = null;

	public int getIdFeedback() {
		return idFeedback;
	}

	public void setIdFeedback(int idFeedback) {
		this.idFeedback = idFeedback;
	}

	public int getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(int avaliacao) {
		this.avaliacao = avaliacao;
	}

	public int getTpFeedback() {
		return tpFeedback;
	}

	public void setTpFeedback(int tpFeedback) {
		this.tpFeedback = tpFeedback;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public Date getTs() {
		return ts;
	}

	public void setTs(Date ts) {
		this.ts = ts;
	}

	public ResponsavelData getFeedbackDe() {
		return feedbackDe;
	}

	public void setFeedbackDe(ResponsavelData feedbackDe) {
		this.feedbackDe = feedbackDe;
	}

	public ResponsavelData getFeedbackPara() {
		return feedbackPara;
	}

	public void setFeedbackPara(ResponsavelData feedbackPara) {
		this.feedbackPara = feedbackPara;
	}

	public ProjetoAtividadeData getProjetoAtividade() {
		return projetoAtividade;
	}

	public void setProjetoAtividade(ProjetoAtividadeData projetoAtividade) {
		this.projetoAtividade = projetoAtividade;
	}
}

