package codemetropolis.toolchain.converter;

import org.kohsuke.args4j.Option;

public class CommandLineOptions {
	
	@Option(name="-h", aliases = { "--help" })
	private boolean showHelp = false;
	
	@Option(name="-t", aliases = {"--type"})
	private String type = null;
	
	@Option(name="-s", aliases = { "--source", "-i", "--input" })
	private String source = null;
	
	@Option(name="-o", aliases = {"--output"})
	private String outputFile = null;
	
	public String getOutputFile(){
		return outputFile;
	}
	
	public String getType() {
		return type;
	}

	public String getSource() {
		return source;
	}

	public boolean showHelp() {
		return showHelp;
	}

}
