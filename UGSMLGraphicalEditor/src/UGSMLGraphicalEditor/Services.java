package UGSMLGraphicalEditor;

import org.eclipse.emf.ecore.EObject;

public class Services
{
    public Boolean IsValidStringForName(EObject self, String arg)
    {
    	if (arg.isEmpty()) {
            return false;
        }
        if (!Character.isJavaIdentifierStart(arg.charAt(0))) {
            return false;
        }
        for (int i = 1; i < arg.length(); i++) {
            if (!Character.isJavaIdentifierPart(arg.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
