package hamy.mdgen.api.generator.base;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import hamy.mdgen.api.generator.imd.IMDViaXAIGeneratorInput;
import hamy.mdgen.common.xml.LocalDateAdapter;
import hamy.mdgen.common.xml.ZonedDateTimeAdapter;

@XmlRootElement(name="generator-input")
@XmlSeeAlso({IMDViaXAIGeneratorInput.class})
@XmlAccessorType (XmlAccessType.FIELD)
public class GeneratorInput {
	private String mdp;
	private String targetParticipant;
	private String targetRole;
	private String nem12FileName;
	@XmlJavaTypeAdapter(value = ZonedDateTimeAdapter.class)
	private ZonedDateTime nem12UpdateDateTime;
	
	@XmlElement(name="channelTemplates")
	private List<ChannelTemplate> channelTemplates;
	
	@XmlElement(name="requestedChannels")
	private List<RequestedChannel> requestedChannels;
	
	public GeneratorInput() {}
	
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	public String getTargetParticipant() {
		return targetParticipant;
	}
	public void setTargetParticipant(String targetParticipant) {
		this.targetParticipant = targetParticipant;
	}
	public String getTargetRole() {
		return targetRole;
	}
	public void setTargetRole(String targetRole) {
		this.targetRole = targetRole;
	}
	public String getNem12FileName() {
		return nem12FileName;
	}
	public void setNem12FileName(String nem12FileName) {
		this.nem12FileName = nem12FileName;
	}
	public ZonedDateTime getNem12UpdateDateTime() {
		return nem12UpdateDateTime;
	}
	public void setNem12UpdateDateTime(ZonedDateTime nem12UpdateDateTime) {
		this.nem12UpdateDateTime = nem12UpdateDateTime;
	}
	
	@XmlRootElement(name="channelTemplate")
	@XmlAccessorType (XmlAccessType.FIELD)
	public static class ChannelTemplate {
		private String nmiSuffix;
		private String uom;
		private int intervalSize;
		private List<Read> reads;
		
		public ChannelTemplate() {}
		
		public String getNmiSuffix() {
			return nmiSuffix;
		}
		public void setNmiSuffix(String channelId) {
			this.nmiSuffix = channelId;
		}
		public String getUom() {
			return uom;
		}
		public void setUom(String uom) {
			this.uom = uom;
		}
		public int getIntervalSize() {
			return intervalSize;
		}
		public void setIntervalSize(int intervalSize) {
			this.intervalSize = intervalSize;
		}
		public List<Read> getReads() {
			return reads;
		}
		public void setReads(List<Read> reads) {
			this.reads = reads;
		}
	}
	
	@XmlRootElement(name="read")
	@XmlAccessorType (XmlAccessType.FIELD)
	public static class Read {
		private double rd;
		private String qual;
		
		public Read() {}

		public double getRd() {
			return rd;
		}
		public void setRd(double rd) {
			this.rd = rd;
		}
		public String getQual() {
			return qual;
		}
		public void setQual(String qual) {
			this.qual = qual;
		}
	}
	
	@XmlRootElement(name="requestedChannel")
	@XmlAccessorType (XmlAccessType.FIELD)
	public static class RequestedChannel {
		private String mdp;
		private String nmi;
		private String meterSerialNumber;
		private String nmiSuffix;
		private String registerId;
		@XmlJavaTypeAdapter(value = LocalDateAdapter.class)
		private LocalDate startDate;
		@XmlJavaTypeAdapter(value = LocalDateAdapter.class)
		private LocalDate endDate;
		private String overrideUom;
		private String transactionId;
		private double indexRead;
		
		public RequestedChannel() {}
		
		public String getMdp() {
			return mdp;
		}
		public void setMdp(String mdp) {
			this.mdp = mdp;
		}
		public String getNmi() {
			return nmi;
		}
		public void setNmi(String nmi) {
			this.nmi = nmi;
		}
		public String getMeterSerialNumber() {
			return meterSerialNumber;
		}
		public void setMeterSerialNumber(String meterSerialNumber) {
			this.meterSerialNumber = meterSerialNumber;
		}
		public String getNmiSuffix() {
			return nmiSuffix;
		}
		public void setNmiSuffix(String nmiSuffix) {
			this.nmiSuffix = nmiSuffix;
		}
		public String getRegisterId() {
			return registerId;
		}
		public void setRegisterId(String registerId) {
			this.registerId = registerId;
		}
		public LocalDate getStartDate() {
			return startDate;
		}
		public void setStartDate(LocalDate startDate) {
			this.startDate = startDate;
		}
		public LocalDate getEndDate() {
			return endDate;
		}
		public void setEndDate(LocalDate endDate) {
			this.endDate = endDate;
		}
		public double getIndexRead() {
			return indexRead;
		}
		public void setIndexRead(double indexRead) {
			this.indexRead = indexRead;
		}
		public String getOverrideUom() {
			return overrideUom;
		}
		public void setOverrideUom(String overrideUom) {
			this.overrideUom = overrideUom;
		}
		public String getTransactionId() {
			return transactionId;
		}
		public void setTransactionId(String transactionId) {
			this.transactionId = transactionId;
		}
	}

	public List<ChannelTemplate> getChannelTemplates() {
		return channelTemplates;
	}

	public void setChannelTemplates(List<ChannelTemplate> channelTemplates) {
		this.channelTemplates = channelTemplates;
	}

	public List<RequestedChannel> getRequestedChannels() {
		return requestedChannels;
	}

	public void setRequestedChannels(List<RequestedChannel> requestedChannels) {
		this.requestedChannels = requestedChannels;
	}
}
