package sbs.service.tools;

import java.util.List;

import sbs.model.tools.ToolsProject;
import sbs.service.GenericService;

public interface ToolsProjectService extends GenericService<ToolsProject, Integer>{

	public List<ToolsProject> findArchivedToolsProjects();
	public List<ToolsProject> findAllPendingToolsProjects();
}