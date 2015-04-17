import static org.junit.Assert.*;
import org.junit.Test;

public class JamesBondTest {

	@Test
	public void testCase_1() {
		assertFalse(JamesBond.bondRegex("(()0"));
	}

	@Test
	public void testCase_2() {
		assertFalse(JamesBond.bondRegex("((0"));
	}

	@Test
	public void testCase_3() {
		assertTrue(JamesBond.bondRegex("((007)0"));
	}

	@Test
	public void testCase_4() {
		assertFalse(JamesBond.bondRegex("((07)0"));
	}

	@Test
	public void testCase_5() {
		assertFalse(JamesBond.bondRegex("((7)0"));
	}

	@Test
	public void testCase_6() {
		assertFalse(JamesBond.bondRegex("())0"));
	}

	@Test
	public void testCase_7() {
		assertFalse(JamesBond.bondRegex("()0"));
	}

	@Test
	public void testCase_8() {
		assertTrue(JamesBond.bondRegex("()007)0"));
	}

	@Test
	public void testCase_9() {
		assertFalse(JamesBond.bondRegex("()07)0"));
	}

	@Test
	public void testCase_10() {
		assertFalse(JamesBond.bondRegex("()7)0"));
	}

	@Test
	public void testCase_11() {
		assertFalse(JamesBond.bondRegex("(0"));
	}

	@Test
	public void testCase_12() {
		assertFalse(JamesBond.bondRegex("(0()0"));
	}

	@Test
	public void testCase_13() {
		assertFalse(JamesBond.bondRegex("(0(0"));
	}

	@Test
	public void testCase_14() {
		assertTrue(JamesBond.bondRegex("(0(007)0"));
	}

	@Test
	public void testCase_15() {
		assertFalse(JamesBond.bondRegex("(0(07)0"));
	}

	@Test
	public void testCase_16() {
		assertFalse(JamesBond.bondRegex("(0(7)0"));
	}

	@Test
	public void testCase_17() {
		assertFalse(JamesBond.bondRegex("(0))0"));
	}

	@Test
	public void testCase_18() {
		assertFalse(JamesBond.bondRegex("(0)0"));
	}

	@Test
	public void testCase_19() {
		assertTrue(JamesBond.bondRegex("(0)007)0"));
	}

	@Test
	public void testCase_20() {
		assertFalse(JamesBond.bondRegex("(0)07)0"));
	}

	@Test
	public void testCase_21() {
		assertFalse(JamesBond.bondRegex("(0)7)0"));
	}

	@Test
	public void testCase_22() {
		assertFalse(JamesBond.bondRegex("(00"));
	}

	@Test
	public void testCase_23() {
		assertFalse(JamesBond.bondRegex("(00()0"));
	}

	@Test
	public void testCase_24() {
		assertFalse(JamesBond.bondRegex("(00(0"));
	}

	@Test
	public void testCase_25() {
		assertTrue(JamesBond.bondRegex("(00(007)0"));
	}

	@Test
	public void testCase_26() {
		assertFalse(JamesBond.bondRegex("(00(07)0"));
	}

	@Test
	public void testCase_27() {
		assertFalse(JamesBond.bondRegex("(00(7)0"));
	}

	@Test
	public void testCase_28() {
		assertFalse(JamesBond.bondRegex("(00))0"));
	}

	@Test
	public void testCase_29() {
		assertFalse(JamesBond.bondRegex("(00)0"));
	}

	@Test
	public void testCase_30() {
		assertTrue(JamesBond.bondRegex("(00)007)0"));
	}

	@Test
	public void testCase_31() {
		assertFalse(JamesBond.bondRegex("(00)07)0"));
	}

	@Test
	public void testCase_32() {
		assertFalse(JamesBond.bondRegex("(00)7)0"));
	}

	@Test
	public void testCase_33() {
		assertFalse(JamesBond.bondRegex("(000"));
	}

	@Test
	public void testCase_34() {
		assertFalse(JamesBond.bondRegex("(000)0"));
	}

	@Test
	public void testCase_35() {
		assertFalse(JamesBond.bondRegex("(0000"));
	}

	@Test
	public void testCase_36() {
		assertTrue(JamesBond.bondRegex("(000007)0"));
	}

	@Test
	public void testCase_37() {
		assertFalse(JamesBond.bondRegex("(00007)0"));
	}

	@Test
	public void testCase_38() {
		assertFalse(JamesBond.bondRegex("(0007)0"));
	}

	@Test
	public void testCase_39() {
		assertFalse(JamesBond.bondRegex("(001)0"));
	}

	@Test
	public void testCase_40() {
		assertFalse(JamesBond.bondRegex("(0010"));
	}

	@Test
	public void testCase_41() {
		assertTrue(JamesBond.bondRegex("(001007)0"));
	}

	@Test
	public void testCase_42() {
		assertFalse(JamesBond.bondRegex("(00107)0"));
	}

	@Test
	public void testCase_43() {
		assertFalse(JamesBond.bondRegex("(0017)0"));
	}

	@Test
	public void testCase_44() {
		assertFalse(JamesBond.bondRegex("(002)0"));
	}

	@Test
	public void testCase_45() {
		assertFalse(JamesBond.bondRegex("(0020"));
	}

	@Test
	public void testCase_46() {
		assertTrue(JamesBond.bondRegex("(002007)0"));
	}

	@Test
	public void testCase_47() {
		assertFalse(JamesBond.bondRegex("(00207)0"));
	}

	@Test
	public void testCase_48() {
		assertFalse(JamesBond.bondRegex("(0027)0"));
	}

	@Test
	public void testCase_49() {
		assertFalse(JamesBond.bondRegex("(003)0"));
	}

	@Test
	public void testCase_50() {
		assertFalse(JamesBond.bondRegex("(0030"));
	}

	@Test
	public void testCase_51() {
		assertTrue(JamesBond.bondRegex("(003007)0"));
	}

	@Test
	public void testCase_52() {
		assertFalse(JamesBond.bondRegex("(00307)0"));
	}

	@Test
	public void testCase_53() {
		assertFalse(JamesBond.bondRegex("(0037)0"));
	}

	@Test
	public void testCase_54() {
		assertFalse(JamesBond.bondRegex("(004)0"));
	}

	@Test
	public void testCase_55() {
		assertFalse(JamesBond.bondRegex("(0040"));
	}

	@Test
	public void testCase_56() {
		assertTrue(JamesBond.bondRegex("(004007)0"));
	}

	@Test
	public void testCase_57() {
		assertFalse(JamesBond.bondRegex("(00407)0"));
	}

	@Test
	public void testCase_58() {
		assertFalse(JamesBond.bondRegex("(0047)0"));
	}

	@Test
	public void testCase_59() {
		assertFalse(JamesBond.bondRegex("(005)0"));
	}

	@Test
	public void testCase_60() {
		assertFalse(JamesBond.bondRegex("(0050"));
	}

	@Test
	public void testCase_61() {
		assertTrue(JamesBond.bondRegex("(005007)0"));
	}

	@Test
	public void testCase_62() {
		assertFalse(JamesBond.bondRegex("(00507)0"));
	}

	@Test
	public void testCase_63() {
		assertFalse(JamesBond.bondRegex("(0057)0"));
	}

	@Test
	public void testCase_64() {
		assertFalse(JamesBond.bondRegex("(006)0"));
	}

	@Test
	public void testCase_65() {
		assertFalse(JamesBond.bondRegex("(0060"));
	}

	@Test
	public void testCase_66() {
		assertTrue(JamesBond.bondRegex("(006007)0"));
	}

	@Test
	public void testCase_67() {
		assertFalse(JamesBond.bondRegex("(00607)0"));
	}

	@Test
	public void testCase_68() {
		assertFalse(JamesBond.bondRegex("(0067)0"));
	}

	@Test
	public void testCase_69() {
		assertTrue(JamesBond.bondRegex("(007()0"));
	}

	@Test
	public void testCase_70() {
		assertFalse(JamesBond.bondRegex("(007(0"));
	}

	@Test
	public void testCase_71() {
		assertTrue(JamesBond.bondRegex("(007(007)0"));
	}

	@Test
	public void testCase_72() {
		assertTrue(JamesBond.bondRegex("(007(07)0"));
	}

	@Test
	public void testCase_73() {
		assertTrue(JamesBond.bondRegex("(007(7)0"));
	}

	@Test
	public void testCase_74() {
		assertTrue(JamesBond.bondRegex("(007)()0"));
	}

	@Test
	public void testCase_75() {
		assertTrue(JamesBond.bondRegex("(007)(0"));
	}

	@Test
	public void testCase_76() {
		assertTrue(JamesBond.bondRegex("(007)(007)0"));
	}

	@Test
	public void testCase_77() {
		assertTrue(JamesBond.bondRegex("(007)(07)0"));
	}

	@Test
	public void testCase_78() {
		assertTrue(JamesBond.bondRegex("(007)(7)0"));
	}

	@Test
	public void testCase_79() {
		assertTrue(JamesBond.bondRegex("(007)))0"));
	}

	@Test
	public void testCase_80() {
		assertTrue(JamesBond.bondRegex("(007))0"));
	}

	@Test
	public void testCase_81() {
		assertTrue(JamesBond.bondRegex("(007))007)0"));
	}

	@Test
	public void testCase_82() {
		assertTrue(JamesBond.bondRegex("(007))07)0"));
	}

	@Test
	public void testCase_83() {
		assertTrue(JamesBond.bondRegex("(007))7)0"));
	}

	@Test
	public void testCase_84() {
		assertTrue(JamesBond.bondRegex("(007)0"));
	}

	@Test
	public void testCase_85() {
		assertTrue(JamesBond.bondRegex("(007)0)0"));
	}

	@Test
	public void testCase_86() {
		assertTrue(JamesBond.bondRegex("(007)00"));
	}

	@Test
	public void testCase_87() {
		assertTrue(JamesBond.bondRegex("(007)0007)0"));
	}

	@Test
	public void testCase_88() {
		assertTrue(JamesBond.bondRegex("(007)007)0"));
	}

	@Test
	public void testCase_89() {
		assertTrue(JamesBond.bondRegex("(007)07)0"));
	}

	@Test
	public void testCase_90() {
		assertTrue(JamesBond.bondRegex("(007)1)0"));
	}

	@Test
	public void testCase_91() {
		assertTrue(JamesBond.bondRegex("(007)10"));
	}

	@Test
	public void testCase_92() {
		assertTrue(JamesBond.bondRegex("(007)1007)0"));
	}

	@Test
	public void testCase_93() {
		assertTrue(JamesBond.bondRegex("(007)107)0"));
	}

	@Test
	public void testCase_94() {
		assertTrue(JamesBond.bondRegex("(007)17)0"));
	}

	@Test
	public void testCase_95() {
		assertTrue(JamesBond.bondRegex("(007)2)0"));
	}

	@Test
	public void testCase_96() {
		assertTrue(JamesBond.bondRegex("(007)20"));
	}

	@Test
	public void testCase_97() {
		assertTrue(JamesBond.bondRegex("(007)2007)0"));
	}

	@Test
	public void testCase_98() {
		assertTrue(JamesBond.bondRegex("(007)207)0"));
	}

	@Test
	public void testCase_99() {
		assertTrue(JamesBond.bondRegex("(007)27)0"));
	}

	@Test
	public void testCase_100() {
		assertTrue(JamesBond.bondRegex("(007)3)0"));
	}

	@Test
	public void testCase_101() {
		assertTrue(JamesBond.bondRegex("(007)30"));
	}

	@Test
	public void testCase_102() {
		assertTrue(JamesBond.bondRegex("(007)3007)0"));
	}

	@Test
	public void testCase_103() {
		assertTrue(JamesBond.bondRegex("(007)307)0"));
	}

	@Test
	public void testCase_104() {
		assertTrue(JamesBond.bondRegex("(007)37)0"));
	}

	@Test
	public void testCase_105() {
		assertTrue(JamesBond.bondRegex("(007)4)0"));
	}

	@Test
	public void testCase_106() {
		assertTrue(JamesBond.bondRegex("(007)40"));
	}

	@Test
	public void testCase_107() {
		assertTrue(JamesBond.bondRegex("(007)4007)0"));
	}

	@Test
	public void testCase_108() {
		assertTrue(JamesBond.bondRegex("(007)407)0"));
	}

	@Test
	public void testCase_109() {
		assertTrue(JamesBond.bondRegex("(007)47)0"));
	}

	@Test
	public void testCase_110() {
		assertTrue(JamesBond.bondRegex("(007)5)0"));
	}

	@Test
	public void testCase_111() {
		assertTrue(JamesBond.bondRegex("(007)50"));
	}

	@Test
	public void testCase_112() {
		assertTrue(JamesBond.bondRegex("(007)5007)0"));
	}

	@Test
	public void testCase_113() {
		assertTrue(JamesBond.bondRegex("(007)507)0"));
	}

	@Test
	public void testCase_114() {
		assertTrue(JamesBond.bondRegex("(007)57)0"));
	}

	@Test
	public void testCase_115() {
		assertTrue(JamesBond.bondRegex("(007)6)0"));
	}

	@Test
	public void testCase_116() {
		assertTrue(JamesBond.bondRegex("(007)60"));
	}

	@Test
	public void testCase_117() {
		assertTrue(JamesBond.bondRegex("(007)6007)0"));
	}

	@Test
	public void testCase_118() {
		assertTrue(JamesBond.bondRegex("(007)607)0"));
	}

	@Test
	public void testCase_119() {
		assertTrue(JamesBond.bondRegex("(007)67)0"));
	}

	@Test
	public void testCase_120() {
		assertTrue(JamesBond.bondRegex("(007)7)0"));
	}

	@Test
	public void testCase_121() {
		assertTrue(JamesBond.bondRegex("(007)70"));
	}

	@Test
	public void testCase_122() {
		assertTrue(JamesBond.bondRegex("(007)7007)0"));
	}

	@Test
	public void testCase_123() {
		assertTrue(JamesBond.bondRegex("(007)707)0"));
	}

	@Test
	public void testCase_124() {
		assertTrue(JamesBond.bondRegex("(007)77)0"));
	}

	@Test
	public void testCase_125() {
		assertTrue(JamesBond.bondRegex("(007)8)0"));
	}

	@Test
	public void testCase_126() {
		assertTrue(JamesBond.bondRegex("(007)80"));
	}

	@Test
	public void testCase_127() {
		assertTrue(JamesBond.bondRegex("(007)8007)0"));
	}

	@Test
	public void testCase_128() {
		assertTrue(JamesBond.bondRegex("(007)807)0"));
	}

	@Test
	public void testCase_129() {
		assertTrue(JamesBond.bondRegex("(007)87)0"));
	}

	@Test
	public void testCase_130() {
		assertTrue(JamesBond.bondRegex("(007)9)0"));
	}

	@Test
	public void testCase_131() {
		assertTrue(JamesBond.bondRegex("(007)90"));
	}

	@Test
	public void testCase_132() {
		assertTrue(JamesBond.bondRegex("(007)9007)0"));
	}

	@Test
	public void testCase_133() {
		assertTrue(JamesBond.bondRegex("(007)907)0"));
	}

	@Test
	public void testCase_134() {
		assertTrue(JamesBond.bondRegex("(007)97)0"));
	}

	@Test
	public void testCase_135() {
		assertFalse(JamesBond.bondRegex("(0070"));
	}

	@Test
	public void testCase_136() {
		assertTrue(JamesBond.bondRegex("(0070)0"));
	}

	@Test
	public void testCase_137() {
		assertFalse(JamesBond.bondRegex("(00700"));
	}

	@Test
	public void testCase_138() {
		assertTrue(JamesBond.bondRegex("(0070007)0"));
	}

	@Test
	public void testCase_139() {
		assertTrue(JamesBond.bondRegex("(007007)0"));
	}

	@Test
	public void testCase_140() {
		assertTrue(JamesBond.bondRegex("(00707)0"));
	}

	@Test
	public void testCase_141() {
		assertTrue(JamesBond.bondRegex("(0071)0"));
	}

	@Test
	public void testCase_142() {
		assertFalse(JamesBond.bondRegex("(00710"));
	}

	@Test
	public void testCase_143() {
		assertTrue(JamesBond.bondRegex("(0071007)0"));
	}

	@Test
	public void testCase_144() {
		assertTrue(JamesBond.bondRegex("(007107)0"));
	}

	@Test
	public void testCase_145() {
		assertTrue(JamesBond.bondRegex("(00717)0"));
	}

	@Test
	public void testCase_146() {
		assertTrue(JamesBond.bondRegex("(0072)0"));
	}

	@Test
	public void testCase_147() {
		assertFalse(JamesBond.bondRegex("(00720"));
	}

	@Test
	public void testCase_148() {
		assertTrue(JamesBond.bondRegex("(0072007)0"));
	}

	@Test
	public void testCase_149() {
		assertTrue(JamesBond.bondRegex("(007207)0"));
	}

	@Test
	public void testCase_150() {
		assertTrue(JamesBond.bondRegex("(00727)0"));
	}

	@Test
	public void testCase_151() {
		assertTrue(JamesBond.bondRegex("(0073)0"));
	}

	@Test
	public void testCase_152() {
		assertFalse(JamesBond.bondRegex("(00730"));
	}

	@Test
	public void testCase_153() {
		assertTrue(JamesBond.bondRegex("(0073007)0"));
	}

	@Test
	public void testCase_154() {
		assertTrue(JamesBond.bondRegex("(007307)0"));
	}

	@Test
	public void testCase_155() {
		assertTrue(JamesBond.bondRegex("(00737)0"));
	}

	@Test
	public void testCase_156() {
		assertTrue(JamesBond.bondRegex("(0074)0"));
	}

	@Test
	public void testCase_157() {
		assertFalse(JamesBond.bondRegex("(00740"));
	}

	@Test
	public void testCase_158() {
		assertTrue(JamesBond.bondRegex("(0074007)0"));
	}

	@Test
	public void testCase_159() {
		assertTrue(JamesBond.bondRegex("(007407)0"));
	}

	@Test
	public void testCase_160() {
		assertTrue(JamesBond.bondRegex("(00747)0"));
	}

	@Test
	public void testCase_161() {
		assertTrue(JamesBond.bondRegex("(0075)0"));
	}

	@Test
	public void testCase_162() {
		assertFalse(JamesBond.bondRegex("(00750"));
	}

	@Test
	public void testCase_163() {
		assertTrue(JamesBond.bondRegex("(0075007)0"));
	}

	@Test
	public void testCase_164() {
		assertTrue(JamesBond.bondRegex("(007507)0"));
	}

	@Test
	public void testCase_165() {
		assertTrue(JamesBond.bondRegex("(00757)0"));
	}

	@Test
	public void testCase_166() {
		assertTrue(JamesBond.bondRegex("(0076)0"));
	}

	@Test
	public void testCase_167() {
		assertFalse(JamesBond.bondRegex("(00760"));
	}

	@Test
	public void testCase_168() {
		assertTrue(JamesBond.bondRegex("(0076007)0"));
	}

	@Test
	public void testCase_169() {
		assertTrue(JamesBond.bondRegex("(007607)0"));
	}

	@Test
	public void testCase_170() {
		assertTrue(JamesBond.bondRegex("(00767)0"));
	}

	@Test
	public void testCase_171() {
		assertTrue(JamesBond.bondRegex("(0077)0"));
	}

	@Test
	public void testCase_172() {
		assertFalse(JamesBond.bondRegex("(00770"));
	}

	@Test
	public void testCase_173() {
		assertTrue(JamesBond.bondRegex("(0077007)0"));
	}

	@Test
	public void testCase_174() {
		assertTrue(JamesBond.bondRegex("(007707)0"));
	}

	@Test
	public void testCase_175() {
		assertTrue(JamesBond.bondRegex("(00777)0"));
	}

	@Test
	public void testCase_176() {
		assertTrue(JamesBond.bondRegex("(0078)0"));
	}

	@Test
	public void testCase_177() {
		assertFalse(JamesBond.bondRegex("(00780"));
	}

	@Test
	public void testCase_178() {
		assertTrue(JamesBond.bondRegex("(0078007)0"));
	}

	@Test
	public void testCase_179() {
		assertTrue(JamesBond.bondRegex("(007807)0"));
	}

	@Test
	public void testCase_180() {
		assertTrue(JamesBond.bondRegex("(00787)0"));
	}

	@Test
	public void testCase_181() {
		assertTrue(JamesBond.bondRegex("(0079)0"));
	}

	@Test
	public void testCase_182() {
		assertFalse(JamesBond.bondRegex("(00790"));
	}

	@Test
	public void testCase_183() {
		assertTrue(JamesBond.bondRegex("(0079007)0"));
	}

	@Test
	public void testCase_184() {
		assertTrue(JamesBond.bondRegex("(007907)0"));
	}

	@Test
	public void testCase_185() {
		assertTrue(JamesBond.bondRegex("(00797)0"));
	}

	@Test
	public void testCase_186() {
		assertFalse(JamesBond.bondRegex("(008)0"));
	}

	@Test
	public void testCase_187() {
		assertFalse(JamesBond.bondRegex("(0080"));
	}

	@Test
	public void testCase_188() {
		assertTrue(JamesBond.bondRegex("(008007)0"));
	}

	@Test
	public void testCase_189() {
		assertFalse(JamesBond.bondRegex("(00807)0"));
	}

	@Test
	public void testCase_190() {
		assertFalse(JamesBond.bondRegex("(0087)0"));
	}

	@Test
	public void testCase_191() {
		assertFalse(JamesBond.bondRegex("(009)0"));
	}

	@Test
	public void testCase_192() {
		assertFalse(JamesBond.bondRegex("(0090"));
	}

	@Test
	public void testCase_193() {
		assertTrue(JamesBond.bondRegex("(009007)0"));
	}

	@Test
	public void testCase_194() {
		assertFalse(JamesBond.bondRegex("(00907)0"));
	}

	@Test
	public void testCase_195() {
		assertFalse(JamesBond.bondRegex("(0097)0"));
	}

	@Test
	public void testCase_196() {
		assertFalse(JamesBond.bondRegex("(01)0"));
	}

	@Test
	public void testCase_197() {
		assertFalse(JamesBond.bondRegex("(010"));
	}

	@Test
	public void testCase_198() {
		assertTrue(JamesBond.bondRegex("(01007)0"));
	}

	@Test
	public void testCase_199() {
		assertFalse(JamesBond.bondRegex("(0107)0"));
	}

	@Test
	public void testCase_200() {
		assertFalse(JamesBond.bondRegex("(017)0"));
	}

	@Test
	public void testCase_201() {
		assertFalse(JamesBond.bondRegex("(02)0"));
	}

	@Test
	public void testCase_202() {
		assertFalse(JamesBond.bondRegex("(020"));
	}

	@Test
	public void testCase_203() {
		assertTrue(JamesBond.bondRegex("(02007)0"));
	}

	@Test
	public void testCase_204() {
		assertFalse(JamesBond.bondRegex("(0207)0"));
	}

	@Test
	public void testCase_205() {
		assertFalse(JamesBond.bondRegex("(027)0"));
	}

	@Test
	public void testCase_206() {
		assertFalse(JamesBond.bondRegex("(03)0"));
	}

	@Test
	public void testCase_207() {
		assertFalse(JamesBond.bondRegex("(030"));
	}

	@Test
	public void testCase_208() {
		assertTrue(JamesBond.bondRegex("(03007)0"));
	}

	@Test
	public void testCase_209() {
		assertFalse(JamesBond.bondRegex("(0307)0"));
	}

	@Test
	public void testCase_210() {
		assertFalse(JamesBond.bondRegex("(037)0"));
	}

	@Test
	public void testCase_211() {
		assertFalse(JamesBond.bondRegex("(04)0"));
	}

	@Test
	public void testCase_212() {
		assertFalse(JamesBond.bondRegex("(040"));
	}

	@Test
	public void testCase_213() {
		assertTrue(JamesBond.bondRegex("(04007)0"));
	}

	@Test
	public void testCase_214() {
		assertFalse(JamesBond.bondRegex("(0407)0"));
	}

	@Test
	public void testCase_215() {
		assertFalse(JamesBond.bondRegex("(047)0"));
	}

	@Test
	public void testCase_216() {
		assertFalse(JamesBond.bondRegex("(05)0"));
	}

	@Test
	public void testCase_217() {
		assertFalse(JamesBond.bondRegex("(050"));
	}

	@Test
	public void testCase_218() {
		assertTrue(JamesBond.bondRegex("(05007)0"));
	}

	@Test
	public void testCase_219() {
		assertFalse(JamesBond.bondRegex("(0507)0"));
	}

	@Test
	public void testCase_220() {
		assertFalse(JamesBond.bondRegex("(057)0"));
	}

	@Test
	public void testCase_221() {
		assertFalse(JamesBond.bondRegex("(06)0"));
	}

	@Test
	public void testCase_222() {
		assertFalse(JamesBond.bondRegex("(060"));
	}

	@Test
	public void testCase_223() {
		assertTrue(JamesBond.bondRegex("(06007)0"));
	}

	@Test
	public void testCase_224() {
		assertFalse(JamesBond.bondRegex("(0607)0"));
	}

	@Test
	public void testCase_225() {
		assertFalse(JamesBond.bondRegex("(067)0"));
	}

	@Test
	public void testCase_226() {
		assertFalse(JamesBond.bondRegex("(07)0"));
	}

	@Test
	public void testCase_227() {
		assertFalse(JamesBond.bondRegex("(070"));
	}

	@Test
	public void testCase_228() {
		assertTrue(JamesBond.bondRegex("(07007)0"));
	}

	@Test
	public void testCase_229() {
		assertFalse(JamesBond.bondRegex("(0707)0"));
	}

	@Test
	public void testCase_230() {
		assertFalse(JamesBond.bondRegex("(077)0"));
	}

	@Test
	public void testCase_231() {
		assertFalse(JamesBond.bondRegex("(08)0"));
	}

	@Test
	public void testCase_232() {
		assertFalse(JamesBond.bondRegex("(080"));
	}

	@Test
	public void testCase_233() {
		assertTrue(JamesBond.bondRegex("(08007)0"));
	}

	@Test
	public void testCase_234() {
		assertFalse(JamesBond.bondRegex("(0807)0"));
	}

	@Test
	public void testCase_235() {
		assertFalse(JamesBond.bondRegex("(087)0"));
	}

	@Test
	public void testCase_236() {
		assertFalse(JamesBond.bondRegex("(09)0"));
	}

	@Test
	public void testCase_237() {
		assertFalse(JamesBond.bondRegex("(090"));
	}

	@Test
	public void testCase_238() {
		assertTrue(JamesBond.bondRegex("(09007)0"));
	}

	@Test
	public void testCase_239() {
		assertFalse(JamesBond.bondRegex("(0907)0"));
	}

	@Test
	public void testCase_240() {
		assertFalse(JamesBond.bondRegex("(097)0"));
	}

	@Test
	public void testCase_241() {
		assertFalse(JamesBond.bondRegex("(1)0"));
	}

	@Test
	public void testCase_242() {
		assertFalse(JamesBond.bondRegex("(10"));
	}

	@Test
	public void testCase_243() {
		assertTrue(JamesBond.bondRegex("(1007)0"));
	}

	@Test
	public void testCase_244() {
		assertFalse(JamesBond.bondRegex("(107)0"));
	}

	@Test
	public void testCase_245() {
		assertFalse(JamesBond.bondRegex("(17)0"));
	}

	@Test
	public void testCase_246() {
		assertFalse(JamesBond.bondRegex("(2)0"));
	}

	@Test
	public void testCase_247() {
		assertFalse(JamesBond.bondRegex("(20"));
	}

	@Test
	public void testCase_248() {
		assertTrue(JamesBond.bondRegex("(2007)0"));
	}

	@Test
	public void testCase_249() {
		assertFalse(JamesBond.bondRegex("(207)0"));
	}

	@Test
	public void testCase_250() {
		assertFalse(JamesBond.bondRegex("(27)0"));
	}

	@Test
	public void testCase_251() {
		assertFalse(JamesBond.bondRegex("(3)0"));
	}

	@Test
	public void testCase_252() {
		assertFalse(JamesBond.bondRegex("(30"));
	}

	@Test
	public void testCase_253() {
		assertTrue(JamesBond.bondRegex("(3007)0"));
	}

	@Test
	public void testCase_254() {
		assertFalse(JamesBond.bondRegex("(307)0"));
	}

	@Test
	public void testCase_255() {
		assertFalse(JamesBond.bondRegex("(37)0"));
	}

	@Test
	public void testCase_256() {
		assertFalse(JamesBond.bondRegex("(4)0"));
	}

	@Test
	public void testCase_257() {
		assertFalse(JamesBond.bondRegex("(40"));
	}

	@Test
	public void testCase_258() {
		assertTrue(JamesBond.bondRegex("(4007)0"));
	}

	@Test
	public void testCase_259() {
		assertFalse(JamesBond.bondRegex("(407)0"));
	}

	@Test
	public void testCase_260() {
		assertFalse(JamesBond.bondRegex("(47)0"));
	}

	@Test
	public void testCase_261() {
		assertFalse(JamesBond.bondRegex("(5)0"));
	}

	@Test
	public void testCase_262() {
		assertFalse(JamesBond.bondRegex("(50"));
	}

	@Test
	public void testCase_263() {
		assertTrue(JamesBond.bondRegex("(5007)0"));
	}

	@Test
	public void testCase_264() {
		assertFalse(JamesBond.bondRegex("(507)0"));
	}

	@Test
	public void testCase_265() {
		assertFalse(JamesBond.bondRegex("(57)0"));
	}

	@Test
	public void testCase_266() {
		assertFalse(JamesBond.bondRegex("(6)0"));
	}

	@Test
	public void testCase_267() {
		assertFalse(JamesBond.bondRegex("(60"));
	}

	@Test
	public void testCase_268() {
		assertTrue(JamesBond.bondRegex("(6007)0"));
	}

	@Test
	public void testCase_269() {
		assertFalse(JamesBond.bondRegex("(607)0"));
	}

	@Test
	public void testCase_270() {
		assertFalse(JamesBond.bondRegex("(67)0"));
	}

	@Test
	public void testCase_271() {
		assertFalse(JamesBond.bondRegex("(7)0"));
	}

	@Test
	public void testCase_272() {
		assertFalse(JamesBond.bondRegex("(70"));
	}

	@Test
	public void testCase_273() {
		assertTrue(JamesBond.bondRegex("(7007)0"));
	}

	@Test
	public void testCase_274() {
		assertFalse(JamesBond.bondRegex("(707)0"));
	}

	@Test
	public void testCase_275() {
		assertFalse(JamesBond.bondRegex("(77)0"));
	}

	@Test
	public void testCase_276() {
		assertFalse(JamesBond.bondRegex("(8)0"));
	}

	@Test
	public void testCase_277() {
		assertFalse(JamesBond.bondRegex("(80"));
	}

	@Test
	public void testCase_278() {
		assertTrue(JamesBond.bondRegex("(8007)0"));
	}

	@Test
	public void testCase_279() {
		assertFalse(JamesBond.bondRegex("(807)0"));
	}

	@Test
	public void testCase_280() {
		assertFalse(JamesBond.bondRegex("(87)0"));
	}

	@Test
	public void testCase_281() {
		assertFalse(JamesBond.bondRegex("(9)0"));
	}

	@Test
	public void testCase_282() {
		assertFalse(JamesBond.bondRegex("(90"));
	}

	@Test
	public void testCase_283() {
		assertTrue(JamesBond.bondRegex("(9007)0"));
	}

	@Test
	public void testCase_284() {
		assertFalse(JamesBond.bondRegex("(907)0"));
	}

	@Test
	public void testCase_285() {
		assertFalse(JamesBond.bondRegex("(97)0"));
	}

	@Test
	public void testCase_286() {
		assertFalse(JamesBond.bondRegex("))0"));
	}

	@Test
	public void testCase_287() {
		assertFalse(JamesBond.bondRegex(")0"));
	}

	@Test
	public void testCase_288() {
		assertFalse(JamesBond.bondRegex(")007)0"));
	}

	@Test
	public void testCase_289() {
		assertFalse(JamesBond.bondRegex(")07)0"));
	}

	@Test
	public void testCase_290() {
		assertFalse(JamesBond.bondRegex(")7)0"));
	}

	@Test
	public void testCase_291() {
		assertFalse(JamesBond.bondRegex("0"));
	}

	@Test
	public void testCase_292() {
		assertFalse(JamesBond.bondRegex("0)0"));
	}

	@Test
	public void testCase_293() {
		assertFalse(JamesBond.bondRegex("00"));
	}

	@Test
	public void testCase_294() {
		assertFalse(JamesBond.bondRegex("0007)0"));
	}

	@Test
	public void testCase_295() {
		assertFalse(JamesBond.bondRegex("007)0"));
	}

	@Test
	public void testCase_296() {
		assertFalse(JamesBond.bondRegex("07)0"));
	}

	@Test
	public void testCase_297() {
		assertFalse(JamesBond.bondRegex("1)0"));
	}

	@Test
	public void testCase_298() {
		assertFalse(JamesBond.bondRegex("10"));
	}

	@Test
	public void testCase_299() {
		assertFalse(JamesBond.bondRegex("1007)0"));
	}

	@Test
	public void testCase_300() {
		assertFalse(JamesBond.bondRegex("107)0"));
	}

	@Test
	public void testCase_301() {
		assertFalse(JamesBond.bondRegex("17)0"));
	}

	@Test
	public void testCase_302() {
		assertFalse(JamesBond.bondRegex("2)0"));
	}

	@Test
	public void testCase_303() {
		assertFalse(JamesBond.bondRegex("20"));
	}

	@Test
	public void testCase_304() {
		assertFalse(JamesBond.bondRegex("2007)0"));
	}

	@Test
	public void testCase_305() {
		assertFalse(JamesBond.bondRegex("207)0"));
	}

	@Test
	public void testCase_306() {
		assertFalse(JamesBond.bondRegex("27)0"));
	}

	@Test
	public void testCase_307() {
		assertFalse(JamesBond.bondRegex("3)0"));
	}

	@Test
	public void testCase_308() {
		assertFalse(JamesBond.bondRegex("30"));
	}

	@Test
	public void testCase_309() {
		assertFalse(JamesBond.bondRegex("3007)0"));
	}

	@Test
	public void testCase_310() {
		assertFalse(JamesBond.bondRegex("307)0"));
	}

	@Test
	public void testCase_311() {
		assertFalse(JamesBond.bondRegex("37)0"));
	}

	@Test
	public void testCase_312() {
		assertFalse(JamesBond.bondRegex("4)0"));
	}

	@Test
	public void testCase_313() {
		assertFalse(JamesBond.bondRegex("40"));
	}

	@Test
	public void testCase_314() {
		assertFalse(JamesBond.bondRegex("4007)0"));
	}

	@Test
	public void testCase_315() {
		assertFalse(JamesBond.bondRegex("407)0"));
	}

	@Test
	public void testCase_316() {
		assertFalse(JamesBond.bondRegex("47)0"));
	}

	@Test
	public void testCase_317() {
		assertFalse(JamesBond.bondRegex("5)0"));
	}

	@Test
	public void testCase_318() {
		assertFalse(JamesBond.bondRegex("50"));
	}

	@Test
	public void testCase_319() {
		assertFalse(JamesBond.bondRegex("5007)0"));
	}

	@Test
	public void testCase_320() {
		assertFalse(JamesBond.bondRegex("507)0"));
	}

	@Test
	public void testCase_321() {
		assertFalse(JamesBond.bondRegex("57)0"));
	}

	@Test
	public void testCase_322() {
		assertFalse(JamesBond.bondRegex("6)0"));
	}

	@Test
	public void testCase_323() {
		assertFalse(JamesBond.bondRegex("60"));
	}

	@Test
	public void testCase_324() {
		assertFalse(JamesBond.bondRegex("6007)0"));
	}

	@Test
	public void testCase_325() {
		assertFalse(JamesBond.bondRegex("607)0"));
	}

	@Test
	public void testCase_326() {
		assertFalse(JamesBond.bondRegex("67)0"));
	}

	@Test
	public void testCase_327() {
		assertFalse(JamesBond.bondRegex("7)0"));
	}

	@Test
	public void testCase_328() {
		assertFalse(JamesBond.bondRegex("70"));
	}

	@Test
	public void testCase_329() {
		assertFalse(JamesBond.bondRegex("7007)0"));
	}

	@Test
	public void testCase_330() {
		assertFalse(JamesBond.bondRegex("707)0"));
	}

	@Test
	public void testCase_331() {
		assertFalse(JamesBond.bondRegex("77)0"));
	}

	@Test
	public void testCase_332() {
		assertFalse(JamesBond.bondRegex("8)0"));
	}

	@Test
	public void testCase_333() {
		assertFalse(JamesBond.bondRegex("80"));
	}

	@Test
	public void testCase_334() {
		assertFalse(JamesBond.bondRegex("8007)0"));
	}

	@Test
	public void testCase_335() {
		assertFalse(JamesBond.bondRegex("807)0"));
	}

	@Test
	public void testCase_336() {
		assertFalse(JamesBond.bondRegex("87)0"));
	}

	@Test
	public void testCase_337() {
		assertFalse(JamesBond.bondRegex("9)0"));
	}

	@Test
	public void testCase_338() {
		assertFalse(JamesBond.bondRegex("90"));
	}

	@Test
	public void testCase_339() {
		assertFalse(JamesBond.bondRegex("9007)0"));
	}

	@Test
	public void testCase_340() {
		assertFalse(JamesBond.bondRegex("907)0"));
	}

	@Test
	public void testCase_341() {
		assertFalse(JamesBond.bondRegex("97)0"));
	}
}
