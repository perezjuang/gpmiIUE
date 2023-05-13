//package com.app;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.Mockito.when;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//
//import com.app.controller.ProjectController;
//import com.app.entity.Project;
//import com.app.entity.Projects;
//import com.app.repository.ProjectCRUDRepository;
//
//@ExtendWith(MockitoExtension.class)
//public class pruebaUnitaria {
//	
//	@InjectMocks
//	ProjectController projectController;
//
//	@Mock
//	ProjectCRUDRepository projectRepositoryMock;
//
//	@Test
//	public void testAddProject() {
//
//		// Given
//		Project project = new Project();
//		project.setId((long) 1);
//
//		// When
//		when(projectRepositoryMock.save(any(Project.class))).thenReturn(project);
//
//		Project projectToAdd = new Project((long) 0, "Lokesh", "Gupta", "howtodoinjava@gmail.com");
//		Projects projects = projectController.getProjects();
//		int originalSize = projects.getProjectList().size();
//		projectController.addProject(projectToAdd);
//		Projects updatedProjects = projectController.getProjects();
//
//		// Then
//		assertThat(updatedProjects.getProjectList().size()).isEqualTo(originalSize + 1);
//		assertThat(updatedProjects.getProjectList().get(originalSize).getprojectName()).isEqualTo(projectToAdd.getprojectName());
//
//	}
//
//	@Test
//	public void testFindAll() {
//		// Given
//		Project Project1 = new Project((long) 0, "Lokesh", "Gupta", "howtodoinjava@gmail.com");
//		Project Project2 = new Project((long) 0, "Alex", "Gussin", "example@gmail.com");
//		List<Project> list = new ArrayList<Project>();
//		list.addAll(Arrays.asList(Project1, Project2));
//
//		when(projectRepositoryMock.findAll()).thenReturn(list);
//
//		// When
//		Projects result = projectController.getProjects();
//
//		// Then
//		assertThat(result.getProjectList().size()).isEqualTo(2);
//		assertThat(result.getProjectList().get(0).getprojectName()).isEqualTo(Project1.getprojectName());
//		assertThat(result.getProjectList().get(1).getprojectName()).isEqualTo(Project2.getprojectName());
//	}
//
//	@Test
//	public void updateProjectTest() {
//
//		// Given
//		Project projectToUpdate = new Project((long) 1, "Dua", "Lipa", "superman@gmail.com");
//
//		when(projectRepositoryMock.save(any(Project.class))).thenReturn(projectToUpdate);
//
//		// When
//		Project updatedProject = projectController.updateProject(projectToUpdate);
//
//		// Then
//		assertThat(updatedProject).isEqualTo(projectToUpdate);
//
//	}
//
//	@Test
//	public void deleteProjectTest() {
//
//		// Given
//		Project projectToDelete = new Project((long) 1, "Dua", "Lipa", "dualipa@gmail.com");
//
//		when(projectRepositoryMock.findById(projectToDelete.getId())).thenReturn(java.util.Optional.ofNullable(projectToDelete));
//
//		// When
//		projectController.deleteProjectApi(projectToDelete);
//
//		// Then
//		assertThat(projectController.getProjects().getProjectList()).doesNotContain(projectToDelete);
//
//	}
//
//}
