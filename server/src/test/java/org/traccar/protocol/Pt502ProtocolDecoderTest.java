package org.traccar.protocol;

import org.junit.jupiter.api.Test;
import org.traccar.ProtocolTest;
import org.traccar.model.Position;

public class Pt502ProtocolDecoderTest extends ProtocolTest {

    @Test
    public void testDecode() throws Exception {

        var decoder = inject(new Pt502ProtocolDecoder(null));

        verifyNull(decoder, binary(
                "24504844302c3936302cffd8ffdb008400140e0f120f0d14121012171514181e32211e1c1c1e3d2c2e243249404c4b47404645505a736250556d5645466488656d777b8182814e608d978c7d96737e817c011517171e1a1e3b21213b7c5346537c7c7c7c7c7c7c7c7c7c7c7c7c7c7c7c7c7c7c7c7c7c7c7c7c7c7c7c7c7c7c7c7c7c7c7c7c7c7c7c7c7c7c7c7c7c7c7c7c7cffc000110800f0014003012100021101031101ffdd0004000affc401a20000010501010101010100000000000000000102030405060708090a0b100002010303020403050504040000017d01020300041105122131410613516107227114328191a1082342b1c11552d1f02433627282090a161718191a25262728292a3435363738393a434445464748494a535455565758595a636465666768696a737475767778797a838485868788898a92939495969798999aa2a3a4a5a6a7a8a9aab2b3b4b5b6b7b8b9bac2c3c4c5c6c7c8c9cad2d3d4d5d6d7d8d9dae1e2e3e4e5e6e7e8e9eaf1f2f3f4f5f6f7f8f9fa0100030101010101010101010000000000000102030405060708090a0b1100020102040403040705040400010277000102031104052131061241510761711322328108144291a1b1c109233352f0156272d10a162434e125f11718191a262728292a35363738393a434445464748494a535455565758595a636465666768696a737475767778797a82838485868788898a92939495969798999aa2a3a4a5a6a7a8a9aab2b3b4b5b6b7b8b9bac2c3c4c5c6c7c8c9cad2d3d4d5d6d7d8d9dae2e3e4e5e6e7e8e9eaf2f3f4f5f6f7f8f9faffda000c03010002110311003f00e5292800ef450020a2800a2801d49400b450014b40052e2800a69340094a05007fffd0e5d14b10055b51b00c76a00527273494005250014500251400525001450015347c25003a928010d25007ffd1e52909a00290d0014b40052d0014500145002e297b50018a280109a6d002d2e2803fffd2e7a04da3777a94fbd0025140052500145002514005250014940054e381400b494008690d007fffd3e4f345001486800a5a005a2800a2801680280168a002909e280100cd028016a48937bfb5007fffd4c5038a42280128a004a280128a003ad2500251400945002a8cb0a9a80133450026692803ffd5e4e8a004a2801694500145002d18a005c5140052e280109a69a0029680140abb147b139eb401ffd6c62290d00251400949400114940052500252d002525003e31c93525002521a004a4a00ffd7e4a8a00281400a29d40094b40053ba500252d0018a31400d3cd250018cd2d005ab58777ccdd074ab645007ffd0c72290d00348a2801280"));

        verifyPosition(decoder, buffer(
                "$POS,718005258,121930.000,V,0514.0960,S,14547.3245,E,0.0,0.0,151020,,/00000,00000/0,0,0,0/106945600//f00//"));

        verifyPosition(decoder, buffer(
                "$PHO3821-1,1156802639,022125.000,A,0707.0014,N,07307.3725,W,0.0,0.1,110418,,,A/00000,00000/0,0,0,0/500//fd4//"));

        verifyPosition(decoder, buffer(
                "$POS,1360000277,182241.000,A,0846.0896,N,07552.1738,W,13.58,26.88,291017,,,A/00000,00000/142,0,0,0/62792900//f65//#"));

        verifyPosition(decoder, buffer(
                "$PHO0-1,1360000260,123012.000,A,0913.9644,N,07548.8345,W,0.0,309.8,111017,,,A/00000,10000/0,0,0,0/64551600//f98//"));

        verifyPosition(decoder, buffer(
                "$POS,865328026243864,151105.000,A,1332.7096,N,204.6787,E,0.0,10.00,050517,,,A/00000,10/1,0/234//FD9/"));

        verifyNull(decoder, buffer(
                "$FUS865328026243864,510-V1.12,A11-V3.0"));

        verifyPosition(decoder, buffer(
                "$HDA,20007,134657.000,A,0626.1607,N,00330.2245,E,33.38,81.79,041016,,,A/00010,00000/270,0,0,0/19948900//fa4//"));

        verifyPosition(decoder, buffer(
                "$HDB,20007,134708.000,A,0626.1759,N,00330.3192,E,26.55,80.37,041016,,,A/00010,00000/23b,0,0,0/19949100//fa4//"));

        verifyPosition(decoder, buffer(
                "$POS,20007,134704.000,A,0626.1698,N,00330.2870,E,31.23,79.58,041016,,,A/00010,00000/26c,0,0,0/19949100//fa4//#"));

        verifyPosition(decoder, buffer(
                "$PHO6608,115099,133140.000,A,1307.1238,N,05936.4194,W,0.00,21.50,290816,,,A/00010,00000/0,0,0,0/185100//f59/"));

        verifyPosition(decoder, buffer(
                "$DFR,40456789,083125.000,A,2232.0971,N,11400.9504,E,0.0,5.00,090714,,,A/00000,00/0,0/200076//FE7/"));

        verifyPosition(decoder, buffer(
                "$FDA,40456789,083125.000,A,2232.0971,N,11400.9504,E,0.0,5.00,090714,,,A/00000,00/0,0/200076//FE7/"));

        verifyAttribute(decoder, buffer(
                "$CPA,40456789,083125.000,A,2232.0971,N,11400.9504,E,7.62,265.24,291117,,,A/00000,00000/0/1200//#"),
                Position.KEY_ALARM, Position.ALARM_POWER_CUT);

        verifyPosition(decoder, buffer(
                "$POS,216769295715,163237.000,A,3258.1738,S,02755.4350,E,0.00,215.88,100915,,,A/0000,0//232300//5b3/"),
                position("2015-09-10 16:32:37.000", true, -32.96956, 27.92392));

        verifyPosition(decoder, buffer(
                "$POS,11023456,033731.000,A,0335.2617,N,09841.1587,E,0.00,88.12,210615,,,A/0000,0/1f8/388900//f33//"));

        verifyPosition(decoder, buffer(
                "$POS,6094,205523.000,A,1013.6223,N,06728.4248,W,0.0,99.3,011112,,,A/00000,00000/0/23895000//"));

        verifyPosition(decoder, buffer(
                "$POS,6120,233326.000,V,0935.1201,N,06914.6933,W,0.00,,151112,,,A/00000,00000/0/0/"));

        verifyPosition(decoder, buffer(
                "$POS,6002,233257.000,A,0931.0430,N,06912.8707,W,0.05,146.98,141112,,,A/00010,00000/0/5360872"));

        verifyPosition(decoder, buffer(
                "$POS,6095,233344.000,V,0933.0451,N,06912.3360,W,,,151112,,,N/00000,00000/0/1677600/"));

        verifyPosition(decoder, buffer(
                "$PHO0,6091,233606.000,A,0902.9855,N,06944.3654,W,0.0,43.8,141112,,,A/00010,00000/0/224000//"));

        verifyPosition(decoder, buffer(
                "$POS,353451000164,082405.000,A,1254.8501,N,10051.6752,E,0.00,237.99,160513,,,A/0000,0/0/55000//a71/"));

        verifyPosition(decoder, buffer(
                "$POS,012896008586486,154215.000,A,0118.0143,S,03646.9144,E,0.00,83.29,180714,,,A/0000,0/0/29200//644/"));

        verifyPosition(decoder, buffer(
                "$POS,1151000,205326.000,A,0901.3037,N,07928.2751,W,48.79,30.55,170814,,,A/00010,10000/0,0,0,0/15986500//fb8/"));

    }

}