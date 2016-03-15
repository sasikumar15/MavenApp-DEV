package com.sasi.staticbeans.vlaues;

import java.util.ArrayList;
import java.util.List;

import com.sasi.beans.claim.ClaimBean;
import com.sasi.beans.claim.ClaimDet;

public class BeanValues {

	public static ClaimBean getClaimBeanValue(){
		ClaimDet claimDet=new ClaimDet();
		claimDet.setClaimId(1);
		claimDet.setDOL("12/02/15");
		claimDet.setVechicleNo("WW1234");
		
		List<ClaimDet> list=new ArrayList<ClaimDet>();
		list.add(claimDet);
		
		ClaimBean claimBean=new ClaimBean();
		claimBean.setClaimId(1);
		claimBean.setDOL("12/02/15");
		claimBean.setClaimNo("ASD123");
		claimBean.setPolicyNo("PSY23");
		claimBean.setVechicleNo("WW1234");
		claimBean.setClaimDetList(list);
		return claimBean;
	}
	
	public static List<ClaimBean> getListOfClaimBeanValue(){
		List<ClaimBean> listOfVal=new ArrayList<ClaimBean>();
		
		ClaimDet claimDet=new ClaimDet();
		claimDet.setClaimId(1);
		claimDet.setDOL("12/02/15");
		claimDet.setVechicleNo("WW1234");
		
		List<ClaimDet> list=new ArrayList<ClaimDet>();
		list.add(claimDet);
		
		ClaimBean claimBean=new ClaimBean();
		claimBean.setClaimId(1);
		claimBean.setDOL("12/02/15");
		claimBean.setClaimNo("ASD123");
		claimBean.setPolicyNo("PSY23");
		claimBean.setVechicleNo("WW1234");
		claimBean.setClaimDetList(list);
		/// 
		
		ClaimDet claimDet1=new ClaimDet();
		claimDet1.setClaimId(1);
		claimDet1.setDOL("12/02/15");
		claimDet1.setVechicleNo("WW1234");
		
		List<ClaimDet> list1=new ArrayList<ClaimDet>();
		list1.add(claimDet1);
		
		ClaimBean claimBean1=new ClaimBean();
		claimBean1.setClaimId(1);
		claimBean1.setDOL("12/02/15");
		claimBean1.setClaimNo("ASD123");
		claimBean1.setPolicyNo("PSY23");
		claimBean1.setVechicleNo("WW1234");
		claimBean1.setClaimDetList(list1);
		
		listOfVal.add(claimBean);
		//listOfVal.add(claimBean1);
		
		return listOfVal;
	}
}
