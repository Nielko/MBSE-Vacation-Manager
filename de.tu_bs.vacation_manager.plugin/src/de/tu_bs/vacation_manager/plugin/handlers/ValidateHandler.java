package de.tu_bs.vacation_manager.plugin.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class ValidateHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		
		// Pfad vom Projekt
	    if (window != null)
	    {
	        IStructuredSelection selection = (IStructuredSelection) window.getSelectionService().getSelection();
	        Object firstElement = selection.getFirstElement();
	        if (firstElement instanceof IAdaptable)
	        {
	            IProject project = (IProject)((IAdaptable)firstElement).getAdapter(IProject.class);
	            IPath path = project.getLocation();
	            System.out.println("Projekt: "+path);
	            
	            //Ausführung
	            StartValidate.start(""+path);
	            
	            MessageDialog.openInformation(
	    				window.getShell(),
	    				"Plugin",
	    				"Validierung erfolgreich ausgeführt!");
	        }
	    }
		
		return null;
	}
}
