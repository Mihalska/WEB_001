<xsl:stylesheet
        xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">

    <xsl:output method="html" />

    <xsl:template match="/">
        <html>
            <head>
                <title>flowers.xsl</title>
            </head>
            <body>
                <table border = "1">
                    <tr>
                        <td>name</td>
                        <td>soil</td>
                        <td>origin</td>

                        <td>stem_color</td>
                        <td>leaf_color</td>
                        <td>size</td>

                        <td>temperature_celsius</td>
                        <td>lighting</td>
                        <td>watering_milliliters</td>

                        <td>multiplying</td>
                    </tr>
                    <xsl:for-each select="//flower">
                        <xsl:sort  order="descending" select="./grovin_tips/temperature_celsius"/>
                        <tr>
                            <td>
                                <xsl:apply-templates select="./name" />
                            </td>
                            <td>
                                <xsl:apply-templates select="./soil" />
                            </td>
                            <td>
                                <xsl:apply-templates select="./origin" />
                            </td>
                            <td>
                                <xsl:apply-templates select="./visual_рarameters/stem_color" />
                            </td>
                            <td>
                                <xsl:apply-templates select="./visual_рarameters/leaf_color" />
                            </td>
                            <td>
                                <xsl:apply-templates select="./visual_рarameters/size" />
                            </td>
                            <td>
                                <xsl:apply-templates select="./grovin_tips/temperature_celsius" />
                            </td>
                            <td>
                                <xsl:apply-templates select="./grovin_tips/lighting" />
                            </td>
                            <td>
                                <xsl:apply-templates select="./grovin_tips/watering_milliliters" />
                            </td>
                            <td>
                                <xsl:apply-templates select="./multiplying" />
                            </td>
                        </tr>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>