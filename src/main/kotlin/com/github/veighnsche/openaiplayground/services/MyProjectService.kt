package com.github.veighnsche.openaiplayground.services

import com.intellij.openapi.project.Project
import com.github.veighnsche.openaiplayground.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
