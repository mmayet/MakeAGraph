import java.util.ArrayList;
import java.util.List;


class DataPair implements DataPoint {

	String axis1Value;
	String axis2Value;

	public List<String> getPoint() {
		List<String> list = new ArrayList<String>();
		list.add(0, axis1Value);
		list.add(1, axis2Value);
		return list;
	}

	@Override
	public String getAxis1Value() {	return axis1Value;}

	@Override
	public String getAxis2Value() {	return axis2Value;}
}
