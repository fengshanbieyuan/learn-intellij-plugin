package com.github.fengshanbieyuan.learnintellijplugin.services

import com.intellij.openapi.project.Project
import com.github.fengshanbieyuan.learnintellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
