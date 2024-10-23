package com.test1;

public class LargeBusinessFatcaAccountListValueCategory {
	private String lbfAccountingValueCatCode;
	private String lbfAccountingValueCatName;
	private String lbfAccountingValueCatDescription;
	private String lbfAccountingvalueCatDefinition;
	private long authorizerId;
	private String owner;
	private String psIds;
	private long serviceNameId;
	private String creationDate;
	private String modifiedDate;

	public LargeBusinessFatcaAccountListValueCategory() {

	}

	public LargeBusinessFatcaAccountListValueCategory(String lbfAccountingValueCatCode,
			String lbfAccountingValueCatName, String lbfAccountingValueCatDescription,
			String lbfAccountingvalueCatDefinition, long authorizerId, String owner, String psIds, long serviceNameId,
			String creationDate, String modifiedDate) {
		super();
		this.lbfAccountingValueCatCode = lbfAccountingValueCatCode;
		this.lbfAccountingValueCatName = lbfAccountingValueCatName;
		this.lbfAccountingValueCatDescription = lbfAccountingValueCatDescription;
		this.lbfAccountingvalueCatDefinition = lbfAccountingvalueCatDefinition;
		this.authorizerId = authorizerId;
		this.owner = owner;
		this.psIds = psIds;
		this.serviceNameId = serviceNameId;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
	}

	public String getLbfAccountingValueCatCode() {
		return lbfAccountingValueCatCode;
	}

	public void setLbfAccountingValueCatCode(String lbfAccountingValueCatCode) {
		this.lbfAccountingValueCatCode = lbfAccountingValueCatCode;
	}

	public String getLbfAccountingValueCatName() {
		return lbfAccountingValueCatName;
	}

	public void setLbfAccountingValueCatName(String lbfAccountingValueCatName) {
		this.lbfAccountingValueCatName = lbfAccountingValueCatName;
	}

	public String getLbfAccountingValueCatDescription() {
		return lbfAccountingValueCatDescription;
	}

	public void setLbfAccountingValueCatDescription(String lbfAccountingValueCatDescription) {
		this.lbfAccountingValueCatDescription = lbfAccountingValueCatDescription;
	}

	public String getLbfAccountingvalueCatDefinition() {
		return lbfAccountingvalueCatDefinition;
	}

	public void setLbfAccountingvalueCatDefinition(String lbfAccountingvalueCatDefinition) {
		this.lbfAccountingvalueCatDefinition = lbfAccountingvalueCatDefinition;
	}

	public long getAuthorizerId() {
		return authorizerId;
	}

	public void setAuthorizerId(long authorizerId) {
		this.authorizerId = authorizerId;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getPsIds() {
		return psIds;
	}

	public void setPsIds(String psIds) {
		this.psIds = psIds;
	}

	public long getServiceNameId() {
		return serviceNameId;
	}

	public void setServiceNameId(long serviceNameId) {
		this.serviceNameId = serviceNameId;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

}
