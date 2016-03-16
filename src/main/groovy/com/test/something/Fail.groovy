package com.test.something

import hudson.tasks.Builder
import org.kohsuke.stapler.DataBoundConstructor

import hudson.model.AbstractBuild
import hudson.Launcher
import hudson.model.TaskListener

class Fail extends Builder {
  private final String fail

  @DataBoundConstructor
  public Fail(String fail) {
    this.fail = fail
  }

	@Override
  public boolean perform(AbstractBuild<?, ?> build, Launcher launcher, BuildListener listener)
          throws InterruptedException, IOException {
      return true
  }
}
