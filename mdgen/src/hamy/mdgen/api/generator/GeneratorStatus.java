package hamy.mdgen.api.generator;

import java.time.LocalDateTime;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="status")
@XmlAccessorType (XmlAccessType.FIELD)
public class GeneratorStatus {
	private String id;
	private String status;
	private LocalDateTime startDateTime;
	private int numberOfRecordsToProcess;
	private int numberOfRecordsProcessed;
	private String errorMessage;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public LocalDateTime getStartDateTime() {
		return startDateTime;
	}
	public void setStartDateTime(LocalDateTime startDateTime) {
		this.startDateTime = startDateTime;
	}
	public int getNumberOfRecordsToProcess() {
		return numberOfRecordsToProcess;
	}
	public void setNumberOfRecordsToProcess(int numberOfRecordsToProcess) {
		this.numberOfRecordsToProcess = numberOfRecordsToProcess;
	}
	public int getNumberOfRecordsProcessed() {
		return numberOfRecordsProcessed;
	}
	public void setNumberOfRecordsProcessed(int numberOfRecordsProcessed) {
		this.numberOfRecordsProcessed = numberOfRecordsProcessed;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
}
