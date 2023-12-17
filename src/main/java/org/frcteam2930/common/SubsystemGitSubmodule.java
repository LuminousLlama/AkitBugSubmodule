package org.frcteam2930.common;

import org.littletonrobotics.junction.AutoLogOutput;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class SubsystemGitSubmodule extends SubsystemBase {
    
    @AutoLogOutput
    double test = 0.0;
    @Override
    public void periodic() {
        test = 29.30;
    }
}
