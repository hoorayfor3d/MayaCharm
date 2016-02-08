package ca.rightsomegoodgames.mayacharm.run.debug;

import com.intellij.execution.process.ProcessHandler;
import com.intellij.execution.ui.ExecutionConsole;
import com.intellij.xdebugger.XDebugSession;
import com.jetbrains.python.debugger.PyRemoteDebugProcess;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.net.ServerSocket;

public class MayaCharmDebugProcess extends PyRemoteDebugProcess {
    @Override
    protected void beforeConnect() {
        System.out.println("MayaCharm: Before_Connect");
        super.beforeConnect();
    }

    @Override
    protected void afterConnect() {
        System.out.println("MayaCharm: After_Connect");
        super.afterConnect();
    }

    @Override
    public void stop() {
        System.out.println("MayaCharm: Stop");
        super.stop();
    }

    public MayaCharmDebugProcess(@NotNull XDebugSession xDebugSession, @NotNull ServerSocket serverSocket, @NotNull ExecutionConsole executionConsole, @Nullable ProcessHandler processHandler, @Nullable String s) {
        super(xDebugSession, serverSocket, executionConsole, processHandler, s);
    }
}