package com.siriuscom.training;

public class ByteAsIntValue {

	
//	(d) A number of bytes given as a int value should be printed out with at most three digits before the decimal comma. The ouput for four different values:
//		123 Byte are 123.0 Byte
//		15323 Byte are 15.323 KByte
//		15323000 Byte are 15.323 MByte
//		1532300001 Byte are 1.532300001 GByte

	public ByteAsIntValue() {
		
	}
	
	public String getBytes(int i) {
		//int num of bytes
		double byteCount = i;
		
		if(byteCount > 1000000000) {
			return byteCount + " Byte are " + (byteCount/1000000000) + "GByte";

		}
		if(byteCount > 1000000) {
			return byteCount + " Byte are " + (byteCount/1000000) + "MByte";

		}
		if(byteCount > 1000) {
			return byteCount + " Byte are " + (byteCount/1000) + "KByte";
		}
		else {
			return byteCount + " Byte are " + (byteCount/1) + "Byte";
		}
		
		/*
		 * 1 Byte = 8 Bit
			1 Kilobyte = 1,024 Bytes
			1 Megabyte = 1,048,576 Bytes
			1 Gigabyte = 1,073,741,824 Bytes
			1 Terabyte = 1,099,511,627,776 Bytes
		 * 
		 * */
	}
}
