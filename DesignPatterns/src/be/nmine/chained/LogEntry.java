package be.nmine.chained;

import java.util.List;

public class LogEntry {

	//logentry getter/setter
	private List<LogEntryParameters> parameters;

	public List<LogEntryParameters> getParameters() {
		return parameters;
	}

	public void setParameters(List<LogEntryParameters> parameters) {
		this.parameters = parameters;
	}
	
	//mapper
	public interface LogEntryParameterMapper {
		public LogEntryParameters apply(String name, String value, String type);
	}

	public static LogEntryParameterMapper addParameter = new LogEntryParameterMapper() {
		@Override
		public LogEntryParameters apply(String name, String value, String type) {
			LogEntryParameters result = new LogEntryParameters();
			result.setName(name);
			result.setType(type);
			result.setValue(value);
			return result;
		}
	};

	public static LogEntryPopuplator on(LogEntry entry) {
		return new LogEntryPopuplator(entry);
	}

	public static class LogEntryPopuplator {

		private LogEntry entry;

		private LogEntryPopuplator(LogEntry entry) {
			this.entry = entry;
		}

		public LogEntryPopuplator addParameter(String name, String value,
				String type) {
			LogEntryParameters result = new LogEntryParameters();
			result.setName(name);
			result.setType(type);
			result.setValue(value);
			entry.getParameters().add(result);
			return this;
		}
	}
	public static void main(String[] args) {
		LogEntry logEntry = new LogEntry();
//		new LogEntryParameters(.apply("name", "value", "type").
		LogEntry.on(logEntry).addParameter("", "", "").addParameter("", "", "");
	}
}