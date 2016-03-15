package com.sasi.beans.claim;

import java.util.Date;
import java.util.List;


public class ClaimBean {

 
    private int claimId;
    
    private String claimNo;
	
	private String vechicleNo;
	
	private String policyNo;
	
	private String engineNo;
	
	private boolean isclaimActive;
	
	private String DOL;
	
	private Date policyStartdate;
	
	private Date policyEndDate;
	
	private List<ClaimDet> claimDetList;

	public int getClaimId() {
		return claimId;
	}

	public void setClaimId(int claimId) {
		this.claimId = claimId;
	}

	public String getClaimNo() {
		return claimNo;
	}

	public void setClaimNo(String claimNo) {
		this.claimNo = claimNo;
	}

	public String getVechicleNo() {
		return vechicleNo;
	}

	public void setVechicleNo(String vechicleNo) {
		this.vechicleNo = vechicleNo;
	}

	public String getPolicyNo() {
		return policyNo;
	}

	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	public String getEngineNo() {
		return engineNo;
	}

	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}

	public boolean isIsclaimActive() {
		return isclaimActive;
	}

	public void setIsclaimActive(boolean isclaimActive) {
		this.isclaimActive = isclaimActive;
	}

	public String getDOL() {
		return DOL;
	}

	public void setDOL(String dOL) {
		DOL = dOL;
	}

	public Date getPolicyStartdate() {
		return policyStartdate;
	}

	public void setPolicyStartdate(Date policyStartdate) {
		this.policyStartdate = policyStartdate;
	}

	public Date getPolicyEndDate() {
		return policyEndDate;
	}

	public void setPolicyEndDate(Date policyEndDate) {
		this.policyEndDate = policyEndDate;
	}

	public List<ClaimDet> getClaimDetList() {
		return claimDetList;
	}

	public void setClaimDetList(List<ClaimDet> claimDetList) {
		this.claimDetList = claimDetList;
	}
	
	
	
	
	
	
    
}
