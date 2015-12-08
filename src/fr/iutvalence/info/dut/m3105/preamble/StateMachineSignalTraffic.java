package fr.iutvalence.info.dut.m3105.preamble;

public interface StateMachineSignalTraffic 
{
	int getTime();
	int setTime(int timeout);
	void setColor(int couleur);
	void setState(State state);
	void pressButton();
}
