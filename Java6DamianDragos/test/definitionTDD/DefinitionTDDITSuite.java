/*
 * junit test for DefinitionTDD suite
 */
package definitionTDD;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Dragos
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({definitionTDD.TriangleIT.class, definitionTDD.Shape2DIT.class, definitionTDD.LineIT.class, definitionTDD.TestDefinitionTDDIT.class, definitionTDD.RectangleIT.class})
public class DefinitionTDDITSuite {
    
}
