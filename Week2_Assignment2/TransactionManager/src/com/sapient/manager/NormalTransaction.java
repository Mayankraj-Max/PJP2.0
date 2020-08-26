package com.sapient.manager;

public class NormalTransaction extends Transactions {

	public NormalTransaction(int extTransactionId, int clientId, String transactionType, String transactionDate, int marketValue, boolean priority) {
	
		this.extTransactionId = extTransactionId;
		this.clientId = clientId;
		this.transactionType = transactionType;
		this.transactionDate = transactionDate;
		this.marketValue = marketValue;
		this.priority = priority;
		
		if(priority) { 
			fee = 500;
		}else {
			if(transactionType.equals("sell") || transactionType.equals("withdraw")) 
				fee = 100;
			else
				fee = 50;
		}	
	}

}
