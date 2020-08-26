package com.sapient.manager;

public class Transactions implements Comparable<Transactions> {

	int extTransactionId;
	int clientId;
	String securityId;
	String transactionType;
	String transactionDate;
	int marketValue;
	boolean priority;
	int fee;
	
	@Override
	public String toString() {
		return clientId + "," + transactionType + "," + transactionDate + "," + "" + "," + fee + "\n";
	}
	
    @Override
	public int compareTo(Transactions o) {

		Transactions x = (Transactions) o;
		int clientIdCompare = this.clientId - x.clientId;
		int feeCompare = this.fee - x.fee;
		int transactionTypeCompare = this.transactionType.compareTo(x.transactionType);
		int transactionDateCompare = this.transactionDate.compareTo(x.transactionDate);
		if (clientIdCompare == 0) {
			if (transactionTypeCompare == 0) {
				if (transactionDateCompare == 0)
					return feeCompare;
				else
					return transactionDateCompare;
			} else {
				return transactionTypeCompare;
			}
		} else {
			return clientIdCompare;
		}
	}
}
