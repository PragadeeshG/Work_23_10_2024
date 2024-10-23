package com.test1;

public class LargeBusinessFatcaAccountListValueScreen {
	private Integer screeId;
	private Integer fatcaCode;
	private String federalScheme;
	private String reportingRegime;
	private String revenueService;
	private String actionIds;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public LargeBusinessFatcaAccountListValueScreen() {

	}

	public LargeBusinessFatcaAccountListValueScreen(Integer screeId, Integer fatcaCode, String federalScheme,
			String reportingRegime, String revenueService, String actionIds, String creationDate, String modifiedDate,
			String entityState) {
		super();
		this.screeId = screeId;
		this.fatcaCode = fatcaCode;
		this.federalScheme = federalScheme;
		this.reportingRegime = reportingRegime;
		this.revenueService = revenueService;
		this.actionIds = actionIds;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getScreeId() {
		return screeId;
	}

	public void setScreeId(Integer screeId) {
		this.screeId = screeId;
	}

	public Integer getFatcaCode() {
		return fatcaCode;
	}

	public void setFatcaCode(Integer fatcaCode) {
		this.fatcaCode = fatcaCode;
	}

	public String getFederalScheme() {
		return federalScheme;
	}

	public void setFederalScheme(String federalScheme) {
		this.federalScheme = federalScheme;
	}

	public String getReportingRegime() {
		return reportingRegime;
	}

	public void setReportingRegime(String reportingRegime) {
		this.reportingRegime = reportingRegime;
	}

	public String getRevenueService() {
		return revenueService;
	}

	public void setRevenueService(String revenueService) {
		this.revenueService = revenueService;
	}

	public String getActionIds() {
		return actionIds;
	}

	public void setActionIds(String actionIds) {
		this.actionIds = actionIds;
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

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
