package fr.iutvalence.info.dut.m3105.preamble;

public interface State 
{
	void timeout(StateMachineSignalTraffic context);
	void buttonPressed(StateMachineSignalTraffic context);
}
