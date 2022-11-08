package in.ashokit.beans;

public class EngineImpl implements IEngine {
	public EngineImpl() {
		System.out.println("EngineImpl::constructor");
	}

	@Override
	public int start() {
		return 1;
	}

}
