package com.github.hl25380630.leoplugins.services

import com.github.hl25380630.leoplugins.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
