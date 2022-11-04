import de.unitrier.st.core.CountryDataPoint;
import de.unitrier.st.core.DataLoader;
import de.unitrier.st.core.DataParser;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class UsefulTest {

    @Test
    public void uTest() {
        DataLoader dataLoader = new DataLoader();
        DataParser dataParser = new DataParser();
        String json = dataLoader.loadJsonFile("countries-aggregated_json.json");
        Map<String, List<CountryDataPoint>> countries = dataParser.parseJsonData(json);

        Assert.assertNotNull(countries);
//        Assert.assertNull(countries);
    }

}
