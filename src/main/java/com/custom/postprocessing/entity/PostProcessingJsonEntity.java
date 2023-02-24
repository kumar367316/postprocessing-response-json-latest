package com.custom.postprocessing.entity;

import java.util.List;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class PostProcessingJsonEntity {

	List<String> processingFiles;
	List<String> archiveFiles;
	List<String> failedFiles;
	List<String> pclFiles;

	public List<String> getProcessingFiles() {
		return processingFiles;
	}

	public void setProcessingFiles(List<String> processingFiles) {
		this.processingFiles = processingFiles;
	}

	public List<String> getArchiveFiles() {
		return archiveFiles;
	}

	public void setArchiveFiles(List<String> archiveFiles) {
		this.archiveFiles = archiveFiles;
	}

	public List<String> getFailedFiles() {
		return failedFiles;
	}

	public void setFailedFiles(List<String> failedFiles) {
		this.failedFiles = failedFiles;
	}

	public List<String> getPclFiles() {
		return pclFiles;
	}

	public void setPclFiles(List<String> pclFiles) {
		this.pclFiles = pclFiles;
	}
}
