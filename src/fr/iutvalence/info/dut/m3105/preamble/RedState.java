package fr.iutvalence.info.dut.m3105.preamble;

public class RedState implements State {

	@Override
	public void timeout(StateMachineSignalTraffic context) {
		context.setState(new GreenState());
	}

	@Override
	public void buttonPressed(StateMachineSignalTraffic context) {
		// TODO Auto-generated method stub
		
	}

}
