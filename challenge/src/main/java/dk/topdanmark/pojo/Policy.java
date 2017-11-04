package dk.topdanmark.pojo;

public class Policy {

	private String policy;
	private String type;
	private String active_from;
	private Integer premium;
	private String currency;

	public String getPolicy() {
		return policy;
	}

	public void setPolicy(String policy) {
		this.policy = policy;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getActive_from() {
		return active_from;
	}

	public void setActive_from(String active_from) {
		this.active_from = active_from;
	}

	public Integer getPremium() {
		return premium;
	}

	public void setPremium(Integer premium) {
		this.premium = premium;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

}
