package no.hvl.dat110.messaging;

import java.util.Arrays;

import no.hvl.dat110.TODO;

public class Message
{

	private byte[] payload;

	public Message(byte[] payload)
	{
		this.payload = payload; // TODO: check for length within boundary
	}

	public Message()
	{
		super();
	}

	public byte[] getData()
	{
		return this.payload;
	}

	public byte[] encapsulate()
	{

		// TODO
		// encapulate/encode the payload of this message in the
		// encoded byte array according to message format
		
		byte[] encoded = null;
		int length = payload.length;
		
		return encoded;

	}

	public void decapsulate(byte[] received)
	{

		// TODO
		// decapsulate the data contained in the received byte array and store it
		// in the payload of this message
		
		int length = received[0];
		byte[] payload = new byte[length];
		
		for (int i = 1; i <= length; i++)
		{
			payload[i-1] = received[i];
		}

		throw new UnsupportedOperationException(TODO.method());

	}
}
