package com.sapient.manager;

public class IntradayTransaction extends Transactions {

	public IntradayTransaction(int extTransactionId, int clientId,String securityId, String transactionType, String transactionDate, int marketValue) {
		this.extTransactionId = extTransactionId;
		this.clientId = clientId;
		this.securityId=securityId;
		this.transactionType = transactionType;
		this.transactionDate = transactionDate;
		this.marketValue = marketValue;
		this.fee=10;
	}

}
