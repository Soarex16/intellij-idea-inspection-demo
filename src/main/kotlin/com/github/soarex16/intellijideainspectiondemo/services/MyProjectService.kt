package com.github.soarex16.intellijideainspectiondemo.services

import com.intellij.openapi.project.Project
import com.github.soarex16.intellijideainspectiondemo.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
