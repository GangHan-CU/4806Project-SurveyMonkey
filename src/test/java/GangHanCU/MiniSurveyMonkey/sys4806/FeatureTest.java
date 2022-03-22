package GangHanCU.MiniSurveyMonkey.sys4806;

import org.junit.Rule;
import org.junit.Test;
import org.togglz.junit.TogglzRule;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FeatureTest {
    @Rule
    public TogglzRule togglzRule = TogglzRule.allEnabled(AppFeature.class);

    @Test
    public void testDefaultEnabledFeature() {
        assertTrue(AppFeature.GRAPHICAL_RESPONSES.isActive());
    }

    @Test
    public void testDefaultDisabledFeature() {
        togglzRule.disable(AppFeature.GRAPHICAL_RESPONSES);
        assertFalse(AppFeature.GRAPHICAL_RESPONSES.isActive());
    }
}
