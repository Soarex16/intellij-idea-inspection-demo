package com.github.soarex16.intellijideainspectiondemo.inspections

import com.github.soarex16.intellijideainspectiondemo.InspectionDemoBundle
import com.intellij.codeInspection.*
import com.intellij.psi.PsiFile

class DemoKotlinInspection: LocalInspectionTool() {
    override fun checkFile(file: PsiFile, manager: InspectionManager, isOnTheFly: Boolean): Array<ProblemDescriptor> {
        val description = InspectionDemoBundle.message("warning.in.kotlin.file", file.name)

        val problem = ProblemDescriptorBase(
            file,
            file,
            description,
            emptyArray(),
            ProblemHighlightType.WARNING,
            false,
            null,
            true,
            true
        )

        return arrayOf(problem)
    }
}