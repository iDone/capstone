// For Capstone Engine. AUTO-GENERATED FILE, DO NOT EDIT
package capstone;

public class Ppc_const {

	// PPC branch codes for some branch instructions

	public static final int PPC_BC_INVALID = 0;
	public static final int PPC_BC_LT = (0<<5)|12;
	public static final int PPC_BC_LE = (1<<5)|4;
	public static final int PPC_BC_EQ = (2<<5)|12;
	public static final int PPC_BC_GE = (0<<5)|4;
	public static final int PPC_BC_GT = (1<<5)|12;
	public static final int PPC_BC_NE = (2<<5)|4;
	public static final int PPC_BC_UN = (3<<5)|12;
	public static final int PPC_BC_NU = (3<<5)|4;
	public static final int PPC_BC_LT_MINUS = (0<<5)|14;
	public static final int PPC_BC_LE_MINUS = (1<<5)|6;
	public static final int PPC_BC_EQ_MINUS = (2<<5)|14;
	public static final int PPC_BC_GE_MINUS = (0<<5)|6;
	public static final int PPC_BC_GT_MINUS = (1<<5)|14;
	public static final int PPC_BC_NE_MINUS = (2<<5)|6;
	public static final int PPC_BC_UN_MINUS = (3<<5)|14;
	public static final int PPC_BC_NU_MINUS = (3<<5)|6;
	public static final int PPC_BC_LT_PLUS = (0<<5)|15;
	public static final int PPC_BC_LE_PLUS = (1<<5)|7;
	public static final int PPC_BC_EQ_PLUS = (2<<5)|15;
	public static final int PPC_BC_GE_PLUS = (0<<5)|7;
	public static final int PPC_BC_GT_PLUS = (1<<5)|15;
	public static final int PPC_BC_NE_PLUS = (2<<5)|7;
	public static final int PPC_BC_UN_PLUS = (3<<5)|15;
	public static final int PPC_BC_NU_PLUS = (3<<5)|7;

	// PPC branch hint for some branch instructions

	public static final int PPC_BH_NO = 0;
	public static final int PPC_BH_PLUS = 1;
	public static final int PPC_BH_MINUS = 2;

	// Operand type for instruction's operands

	public static final int PPC_OP_INVALID = 0;
	public static final int PPC_OP_REG = 1;
	public static final int PPC_OP_IMM = 2;
	public static final int PPC_OP_MEM = 3;

	// PPC registers

	public static final int PPC_REG_INVALID = 0;
	public static final int PPC_REG_CARRY = 1;
	public static final int PPC_REG_CR0 = 2;
	public static final int PPC_REG_CR1 = 3;
	public static final int PPC_REG_CR2 = 4;
	public static final int PPC_REG_CR3 = 5;
	public static final int PPC_REG_CR4 = 6;
	public static final int PPC_REG_CR5 = 7;
	public static final int PPC_REG_CR6 = 8;
	public static final int PPC_REG_CR7 = 9;
	public static final int PPC_REG_CR8 = 10;
	public static final int PPC_REG_CR9 = 11;
	public static final int PPC_REG_CR10 = 12;
	public static final int PPC_REG_CR11 = 13;
	public static final int PPC_REG_CR12 = 14;
	public static final int PPC_REG_CR13 = 15;
	public static final int PPC_REG_CR14 = 16;
	public static final int PPC_REG_CR15 = 17;
	public static final int PPC_REG_CR16 = 18;
	public static final int PPC_REG_CR17 = 19;
	public static final int PPC_REG_CR18 = 20;
	public static final int PPC_REG_CR19 = 21;
	public static final int PPC_REG_CR20 = 22;
	public static final int PPC_REG_CR21 = 23;
	public static final int PPC_REG_CR22 = 24;
	public static final int PPC_REG_CR23 = 25;
	public static final int PPC_REG_CR24 = 26;
	public static final int PPC_REG_CR25 = 27;
	public static final int PPC_REG_CR26 = 28;
	public static final int PPC_REG_CR27 = 29;
	public static final int PPC_REG_CR28 = 30;
	public static final int PPC_REG_CR29 = 31;
	public static final int PPC_REG_CR30 = 32;
	public static final int PPC_REG_CR31 = 33;
	public static final int PPC_REG_CTR = 34;
	public static final int PPC_REG_F0 = 35;
	public static final int PPC_REG_F1 = 36;
	public static final int PPC_REG_F2 = 37;
	public static final int PPC_REG_F3 = 38;
	public static final int PPC_REG_F4 = 39;
	public static final int PPC_REG_F5 = 40;
	public static final int PPC_REG_F6 = 41;
	public static final int PPC_REG_F7 = 42;
	public static final int PPC_REG_F8 = 43;
	public static final int PPC_REG_F9 = 44;
	public static final int PPC_REG_F10 = 45;
	public static final int PPC_REG_F11 = 46;
	public static final int PPC_REG_F12 = 47;
	public static final int PPC_REG_F13 = 48;
	public static final int PPC_REG_F14 = 49;
	public static final int PPC_REG_F15 = 50;
	public static final int PPC_REG_F16 = 51;
	public static final int PPC_REG_F17 = 52;
	public static final int PPC_REG_F18 = 53;
	public static final int PPC_REG_F19 = 54;
	public static final int PPC_REG_F20 = 55;
	public static final int PPC_REG_F21 = 56;
	public static final int PPC_REG_F22 = 57;
	public static final int PPC_REG_F23 = 58;
	public static final int PPC_REG_F24 = 59;
	public static final int PPC_REG_F25 = 60;
	public static final int PPC_REG_F26 = 61;
	public static final int PPC_REG_F27 = 62;
	public static final int PPC_REG_F28 = 63;
	public static final int PPC_REG_F29 = 64;
	public static final int PPC_REG_F30 = 65;
	public static final int PPC_REG_F31 = 66;
	public static final int PPC_REG_LR = 67;
	public static final int PPC_REG_R0 = 68;
	public static final int PPC_REG_R1 = 69;
	public static final int PPC_REG_R2 = 70;
	public static final int PPC_REG_R3 = 71;
	public static final int PPC_REG_R4 = 72;
	public static final int PPC_REG_R5 = 73;
	public static final int PPC_REG_R6 = 74;
	public static final int PPC_REG_R7 = 75;
	public static final int PPC_REG_R8 = 76;
	public static final int PPC_REG_R9 = 77;
	public static final int PPC_REG_R10 = 78;
	public static final int PPC_REG_R11 = 79;
	public static final int PPC_REG_R12 = 80;
	public static final int PPC_REG_R13 = 81;
	public static final int PPC_REG_R14 = 82;
	public static final int PPC_REG_R15 = 83;
	public static final int PPC_REG_R16 = 84;
	public static final int PPC_REG_R17 = 85;
	public static final int PPC_REG_R18 = 86;
	public static final int PPC_REG_R19 = 87;
	public static final int PPC_REG_R20 = 88;
	public static final int PPC_REG_R21 = 89;
	public static final int PPC_REG_R22 = 90;
	public static final int PPC_REG_R23 = 91;
	public static final int PPC_REG_R24 = 92;
	public static final int PPC_REG_R25 = 93;
	public static final int PPC_REG_R26 = 94;
	public static final int PPC_REG_R27 = 95;
	public static final int PPC_REG_R28 = 96;
	public static final int PPC_REG_R29 = 97;
	public static final int PPC_REG_R30 = 98;
	public static final int PPC_REG_R31 = 99;
	public static final int PPC_REG_V0 = 100;
	public static final int PPC_REG_V1 = 101;
	public static final int PPC_REG_V2 = 102;
	public static final int PPC_REG_V3 = 103;
	public static final int PPC_REG_V4 = 104;
	public static final int PPC_REG_V5 = 105;
	public static final int PPC_REG_V6 = 106;
	public static final int PPC_REG_V7 = 107;
	public static final int PPC_REG_V8 = 108;
	public static final int PPC_REG_V9 = 109;
	public static final int PPC_REG_V10 = 110;
	public static final int PPC_REG_V11 = 111;
	public static final int PPC_REG_V12 = 112;
	public static final int PPC_REG_V13 = 113;
	public static final int PPC_REG_V14 = 114;
	public static final int PPC_REG_V15 = 115;
	public static final int PPC_REG_V16 = 116;
	public static final int PPC_REG_V17 = 117;
	public static final int PPC_REG_V18 = 118;
	public static final int PPC_REG_V19 = 119;
	public static final int PPC_REG_V20 = 120;
	public static final int PPC_REG_V21 = 121;
	public static final int PPC_REG_V22 = 122;
	public static final int PPC_REG_V23 = 123;
	public static final int PPC_REG_V24 = 124;
	public static final int PPC_REG_V25 = 125;
	public static final int PPC_REG_V26 = 126;
	public static final int PPC_REG_V27 = 127;
	public static final int PPC_REG_V28 = 128;
	public static final int PPC_REG_V29 = 129;
	public static final int PPC_REG_V30 = 130;
	public static final int PPC_REG_V31 = 131;
	public static final int PPC_REG_VRSAVE = 132;
	public static final int PPC_REG_RM = 133;
	public static final int PPC_REG_CTR8 = 134;
	public static final int PPC_REG_LR8 = 135;
	public static final int PPC_REG_CR1EQ = 136;
	public static final int PPC_REG_MAX = 137;

	// PPC instruction

	public static final int PPC_INS_INVALID = 0;
	public static final int PPC_INS_ADD = 1;
	public static final int PPC_INS_ADDC = 2;
	public static final int PPC_INS_ADDE = 3;
	public static final int PPC_INS_ADDI = 4;
	public static final int PPC_INS_ADDIC = 5;
	public static final int PPC_INS_ADDIS = 6;
	public static final int PPC_INS_ADDME = 7;
	public static final int PPC_INS_ADDZE = 8;
	public static final int PPC_INS_AND = 9;
	public static final int PPC_INS_ANDC = 10;
	public static final int PPC_INS_ANDIS = 11;
	public static final int PPC_INS_ANDI = 12;
	public static final int PPC_INS_B = 13;
	public static final int PPC_INS_BA = 14;
	public static final int PPC_INS_BCL = 15;
	public static final int PPC_INS_BCTR = 16;
	public static final int PPC_INS_BCTRL = 17;
	public static final int PPC_INS_BDNZ = 18;
	public static final int PPC_INS_BDNZA = 19;
	public static final int PPC_INS_BDNZL = 20;
	public static final int PPC_INS_BDNZLA = 21;
	public static final int PPC_INS_BDNZLR = 22;
	public static final int PPC_INS_BDNZLRL = 23;
	public static final int PPC_INS_BDZ = 24;
	public static final int PPC_INS_BDZA = 25;
	public static final int PPC_INS_BDZL = 26;
	public static final int PPC_INS_BDZLA = 27;
	public static final int PPC_INS_BDZLR = 28;
	public static final int PPC_INS_BDZLRL = 29;
	public static final int PPC_INS_BL = 30;
	public static final int PPC_INS_BLA = 31;
	public static final int PPC_INS_BLR = 32;
	public static final int PPC_INS_BLRL = 33;
	public static final int PPC_INS_CMPD = 34;
	public static final int PPC_INS_CMPDI = 35;
	public static final int PPC_INS_CMPLD = 36;
	public static final int PPC_INS_CMPLDI = 37;
	public static final int PPC_INS_CMPLW = 38;
	public static final int PPC_INS_CMPLWI = 39;
	public static final int PPC_INS_CMPW = 40;
	public static final int PPC_INS_CMPWI = 41;
	public static final int PPC_INS_CNTLZD = 42;
	public static final int PPC_INS_CNTLZW = 43;
	public static final int PPC_INS_CREQV = 44;
	public static final int PPC_INS_CRXOR = 45;
	public static final int PPC_INS_CRAND = 46;
	public static final int PPC_INS_CRANDC = 47;
	public static final int PPC_INS_CRNAND = 48;
	public static final int PPC_INS_CRNOR = 49;
	public static final int PPC_INS_CROR = 50;
	public static final int PPC_INS_CRORC = 51;
	public static final int PPC_INS_DCBA = 52;
	public static final int PPC_INS_DCBF = 53;
	public static final int PPC_INS_DCBI = 54;
	public static final int PPC_INS_DCBST = 55;
	public static final int PPC_INS_DCBT = 56;
	public static final int PPC_INS_DCBTST = 57;
	public static final int PPC_INS_DCBZ = 58;
	public static final int PPC_INS_DCBZL = 59;
	public static final int PPC_INS_DIVD = 60;
	public static final int PPC_INS_DIVDU = 61;
	public static final int PPC_INS_DIVW = 62;
	public static final int PPC_INS_DIVWU = 63;
	public static final int PPC_INS_DSS = 64;
	public static final int PPC_INS_DSSALL = 65;
	public static final int PPC_INS_DST = 66;
	public static final int PPC_INS_DSTST = 67;
	public static final int PPC_INS_DSTSTT = 68;
	public static final int PPC_INS_DSTT = 69;
	public static final int PPC_INS_EIEIO = 70;
	public static final int PPC_INS_EQV = 71;
	public static final int PPC_INS_EXTSB = 72;
	public static final int PPC_INS_EXTSH = 73;
	public static final int PPC_INS_EXTSW = 74;
	public static final int PPC_INS_FABS = 75;
	public static final int PPC_INS_FADD = 76;
	public static final int PPC_INS_FADDS = 77;
	public static final int PPC_INS_FCFID = 78;
	public static final int PPC_INS_FCFIDS = 79;
	public static final int PPC_INS_FCFIDU = 80;
	public static final int PPC_INS_FCFIDUS = 81;
	public static final int PPC_INS_FCMPU = 82;
	public static final int PPC_INS_FCPSGN = 83;
	public static final int PPC_INS_FCTID = 84;
	public static final int PPC_INS_FCTIDUZ = 85;
	public static final int PPC_INS_FCTIDZ = 86;
	public static final int PPC_INS_FCTIW = 87;
	public static final int PPC_INS_FCTIWUZ = 88;
	public static final int PPC_INS_FCTIWZ = 89;
	public static final int PPC_INS_FDIV = 90;
	public static final int PPC_INS_FDIVS = 91;
	public static final int PPC_INS_FMADD = 92;
	public static final int PPC_INS_FMADDS = 93;
	public static final int PPC_INS_FMR = 94;
	public static final int PPC_INS_FMSUB = 95;
	public static final int PPC_INS_FMSUBS = 96;
	public static final int PPC_INS_FMUL = 97;
	public static final int PPC_INS_FMULS = 98;
	public static final int PPC_INS_FNABS = 99;
	public static final int PPC_INS_FNEG = 100;
	public static final int PPC_INS_FNMADD = 101;
	public static final int PPC_INS_FNMADDS = 102;
	public static final int PPC_INS_FNMSUB = 103;
	public static final int PPC_INS_FNMSUBS = 104;
	public static final int PPC_INS_FRE = 105;
	public static final int PPC_INS_FRES = 106;
	public static final int PPC_INS_FRIM = 107;
	public static final int PPC_INS_FRIN = 108;
	public static final int PPC_INS_FRIP = 109;
	public static final int PPC_INS_FRIZ = 110;
	public static final int PPC_INS_FRSP = 111;
	public static final int PPC_INS_FRSQRTE = 112;
	public static final int PPC_INS_FRSQRTES = 113;
	public static final int PPC_INS_FSEL = 114;
	public static final int PPC_INS_FSQRT = 115;
	public static final int PPC_INS_FSQRTS = 116;
	public static final int PPC_INS_FSUB = 117;
	public static final int PPC_INS_FSUBS = 118;
	public static final int PPC_INS_ICBI = 119;
	public static final int PPC_INS_ISEL = 120;
	public static final int PPC_INS_ISYNC = 121;
	public static final int PPC_INS_LA = 122;
	public static final int PPC_INS_LBZ = 123;
	public static final int PPC_INS_LBZU = 124;
	public static final int PPC_INS_LBZUX = 125;
	public static final int PPC_INS_LBZX = 126;
	public static final int PPC_INS_LD = 127;
	public static final int PPC_INS_LDARX = 128;
	public static final int PPC_INS_LDBRX = 129;
	public static final int PPC_INS_LDU = 130;
	public static final int PPC_INS_LDUX = 131;
	public static final int PPC_INS_LDX = 132;
	public static final int PPC_INS_LFD = 133;
	public static final int PPC_INS_LFDU = 134;
	public static final int PPC_INS_LFDUX = 135;
	public static final int PPC_INS_LFDX = 136;
	public static final int PPC_INS_LFIWAX = 137;
	public static final int PPC_INS_LFIWZX = 138;
	public static final int PPC_INS_LFS = 139;
	public static final int PPC_INS_LFSU = 140;
	public static final int PPC_INS_LFSUX = 141;
	public static final int PPC_INS_LFSX = 142;
	public static final int PPC_INS_LHA = 143;
	public static final int PPC_INS_LHAU = 144;
	public static final int PPC_INS_LHAUX = 145;
	public static final int PPC_INS_LHAX = 146;
	public static final int PPC_INS_LHBRX = 147;
	public static final int PPC_INS_LHZ = 148;
	public static final int PPC_INS_LHZU = 149;
	public static final int PPC_INS_LHZUX = 150;
	public static final int PPC_INS_LHZX = 151;
	public static final int PPC_INS_LI = 152;
	public static final int PPC_INS_LIS = 153;
	public static final int PPC_INS_LMW = 154;
	public static final int PPC_INS_LVEBX = 155;
	public static final int PPC_INS_LVEHX = 156;
	public static final int PPC_INS_LVEWX = 157;
	public static final int PPC_INS_LVSL = 158;
	public static final int PPC_INS_LVSR = 159;
	public static final int PPC_INS_LVX = 160;
	public static final int PPC_INS_LVXL = 161;
	public static final int PPC_INS_LWA = 162;
	public static final int PPC_INS_LWARX = 163;
	public static final int PPC_INS_LWAUX = 164;
	public static final int PPC_INS_LWAX = 165;
	public static final int PPC_INS_LWBRX = 166;
	public static final int PPC_INS_LWZ = 167;
	public static final int PPC_INS_LWZU = 168;
	public static final int PPC_INS_LWZUX = 169;
	public static final int PPC_INS_LWZX = 170;
	public static final int PPC_INS_MCRF = 171;
	public static final int PPC_INS_MFCR = 172;
	public static final int PPC_INS_MFCTR = 173;
	public static final int PPC_INS_MFFS = 174;
	public static final int PPC_INS_MFLR = 175;
	public static final int PPC_INS_MFMSR = 176;
	public static final int PPC_INS_MFOCRF = 177;
	public static final int PPC_INS_MFSPR = 178;
	public static final int PPC_INS_MFTB = 179;
	public static final int PPC_INS_MFVSCR = 180;
	public static final int PPC_INS_MSYNC = 181;
	public static final int PPC_INS_MTCRF = 182;
	public static final int PPC_INS_MTCTR = 183;
	public static final int PPC_INS_MTFSB0 = 184;
	public static final int PPC_INS_MTFSB1 = 185;
	public static final int PPC_INS_MTFSF = 186;
	public static final int PPC_INS_MTLR = 187;
	public static final int PPC_INS_MTMSR = 188;
	public static final int PPC_INS_MTMSRD = 189;
	public static final int PPC_INS_MTOCRF = 190;
	public static final int PPC_INS_MTSPR = 191;
	public static final int PPC_INS_MTVSCR = 192;
	public static final int PPC_INS_MULHD = 193;
	public static final int PPC_INS_MULHDU = 194;
	public static final int PPC_INS_MULHW = 195;
	public static final int PPC_INS_MULHWU = 196;
	public static final int PPC_INS_MULLD = 197;
	public static final int PPC_INS_MULLI = 198;
	public static final int PPC_INS_MULLW = 199;
	public static final int PPC_INS_NAND = 200;
	public static final int PPC_INS_NEG = 201;
	public static final int PPC_INS_NOP = 202;
	public static final int PPC_INS_ORI = 203;
	public static final int PPC_INS_NOR = 204;
	public static final int PPC_INS_OR = 205;
	public static final int PPC_INS_ORC = 206;
	public static final int PPC_INS_ORIS = 207;
	public static final int PPC_INS_POPCNTD = 208;
	public static final int PPC_INS_POPCNTW = 209;
	public static final int PPC_INS_RLDCL = 210;
	public static final int PPC_INS_RLDCR = 211;
	public static final int PPC_INS_RLDIC = 212;
	public static final int PPC_INS_RLDICL = 213;
	public static final int PPC_INS_RLDICR = 214;
	public static final int PPC_INS_RLDIMI = 215;
	public static final int PPC_INS_RLWIMI = 216;
	public static final int PPC_INS_RLWINM = 217;
	public static final int PPC_INS_RLWNM = 218;
	public static final int PPC_INS_SC = 219;
	public static final int PPC_INS_SLBIA = 220;
	public static final int PPC_INS_SLBIE = 221;
	public static final int PPC_INS_SLBMFEE = 222;
	public static final int PPC_INS_SLBMTE = 223;
	public static final int PPC_INS_SLD = 224;
	public static final int PPC_INS_SLW = 225;
	public static final int PPC_INS_SRAD = 226;
	public static final int PPC_INS_SRADI = 227;
	public static final int PPC_INS_SRAW = 228;
	public static final int PPC_INS_SRAWI = 229;
	public static final int PPC_INS_SRD = 230;
	public static final int PPC_INS_SRW = 231;
	public static final int PPC_INS_STB = 232;
	public static final int PPC_INS_STBU = 233;
	public static final int PPC_INS_STBUX = 234;
	public static final int PPC_INS_STBX = 235;
	public static final int PPC_INS_STD = 236;
	public static final int PPC_INS_STDBRX = 237;
	public static final int PPC_INS_STDCX = 238;
	public static final int PPC_INS_STDU = 239;
	public static final int PPC_INS_STDUX = 240;
	public static final int PPC_INS_STDX = 241;
	public static final int PPC_INS_STFD = 242;
	public static final int PPC_INS_STFDU = 243;
	public static final int PPC_INS_STFDUX = 244;
	public static final int PPC_INS_STFDX = 245;
	public static final int PPC_INS_STFIWX = 246;
	public static final int PPC_INS_STFS = 247;
	public static final int PPC_INS_STFSU = 248;
	public static final int PPC_INS_STFSUX = 249;
	public static final int PPC_INS_STFSX = 250;
	public static final int PPC_INS_STH = 251;
	public static final int PPC_INS_STHBRX = 252;
	public static final int PPC_INS_STHU = 253;
	public static final int PPC_INS_STHUX = 254;
	public static final int PPC_INS_STHX = 255;
	public static final int PPC_INS_STMW = 256;
	public static final int PPC_INS_STVEBX = 257;
	public static final int PPC_INS_STVEHX = 258;
	public static final int PPC_INS_STVEWX = 259;
	public static final int PPC_INS_STVX = 260;
	public static final int PPC_INS_STVXL = 261;
	public static final int PPC_INS_STW = 262;
	public static final int PPC_INS_STWBRX = 263;
	public static final int PPC_INS_STWCX = 264;
	public static final int PPC_INS_STWU = 265;
	public static final int PPC_INS_STWUX = 266;
	public static final int PPC_INS_STWX = 267;
	public static final int PPC_INS_SUBF = 268;
	public static final int PPC_INS_SUBFC = 269;
	public static final int PPC_INS_SUBFE = 270;
	public static final int PPC_INS_SUBFIC = 271;
	public static final int PPC_INS_SUBFME = 272;
	public static final int PPC_INS_SUBFZE = 273;
	public static final int PPC_INS_SYNC = 274;
	public static final int PPC_INS_TD = 275;
	public static final int PPC_INS_TDI = 276;
	public static final int PPC_INS_TLBIE = 277;
	public static final int PPC_INS_TLBIEL = 278;
	public static final int PPC_INS_TLBSYNC = 279;
	public static final int PPC_INS_TRAP = 280;
	public static final int PPC_INS_TW = 281;
	public static final int PPC_INS_TWI = 282;
	public static final int PPC_INS_VADDCUW = 283;
	public static final int PPC_INS_VADDFP = 284;
	public static final int PPC_INS_VADDSBS = 285;
	public static final int PPC_INS_VADDSHS = 286;
	public static final int PPC_INS_VADDSWS = 287;
	public static final int PPC_INS_VADDUBM = 288;
	public static final int PPC_INS_VADDUBS = 289;
	public static final int PPC_INS_VADDUHM = 290;
	public static final int PPC_INS_VADDUHS = 291;
	public static final int PPC_INS_VADDUWM = 292;
	public static final int PPC_INS_VADDUWS = 293;
	public static final int PPC_INS_VAND = 294;
	public static final int PPC_INS_VANDC = 295;
	public static final int PPC_INS_VAVGSB = 296;
	public static final int PPC_INS_VAVGSH = 297;
	public static final int PPC_INS_VAVGSW = 298;
	public static final int PPC_INS_VAVGUB = 299;
	public static final int PPC_INS_VAVGUH = 300;
	public static final int PPC_INS_VAVGUW = 301;
	public static final int PPC_INS_VCFSX = 302;
	public static final int PPC_INS_VCFUX = 303;
	public static final int PPC_INS_VCMPBFP = 304;
	public static final int PPC_INS_VCMPEQFP = 305;
	public static final int PPC_INS_VCMPEQUB = 306;
	public static final int PPC_INS_VCMPEQUH = 307;
	public static final int PPC_INS_VCMPEQUW = 308;
	public static final int PPC_INS_VCMPGEFP = 309;
	public static final int PPC_INS_VCMPGTFP = 310;
	public static final int PPC_INS_VCMPGTSB = 311;
	public static final int PPC_INS_VCMPGTSH = 312;
	public static final int PPC_INS_VCMPGTSW = 313;
	public static final int PPC_INS_VCMPGTUB = 314;
	public static final int PPC_INS_VCMPGTUH = 315;
	public static final int PPC_INS_VCMPGTUW = 316;
	public static final int PPC_INS_VCTSXS = 317;
	public static final int PPC_INS_VCTUXS = 318;
	public static final int PPC_INS_VEXPTEFP = 319;
	public static final int PPC_INS_VLOGEFP = 320;
	public static final int PPC_INS_VMADDFP = 321;
	public static final int PPC_INS_VMAXFP = 322;
	public static final int PPC_INS_VMAXSB = 323;
	public static final int PPC_INS_VMAXSH = 324;
	public static final int PPC_INS_VMAXSW = 325;
	public static final int PPC_INS_VMAXUB = 326;
	public static final int PPC_INS_VMAXUH = 327;
	public static final int PPC_INS_VMAXUW = 328;
	public static final int PPC_INS_VMHADDSHS = 329;
	public static final int PPC_INS_VMHRADDSHS = 330;
	public static final int PPC_INS_VMINFP = 331;
	public static final int PPC_INS_VMINSB = 332;
	public static final int PPC_INS_VMINSH = 333;
	public static final int PPC_INS_VMINSW = 334;
	public static final int PPC_INS_VMINUB = 335;
	public static final int PPC_INS_VMINUH = 336;
	public static final int PPC_INS_VMINUW = 337;
	public static final int PPC_INS_VMLADDUHM = 338;
	public static final int PPC_INS_VMRGHB = 339;
	public static final int PPC_INS_VMRGHH = 340;
	public static final int PPC_INS_VMRGHW = 341;
	public static final int PPC_INS_VMRGLB = 342;
	public static final int PPC_INS_VMRGLH = 343;
	public static final int PPC_INS_VMRGLW = 344;
	public static final int PPC_INS_VMSUMMBM = 345;
	public static final int PPC_INS_VMSUMSHM = 346;
	public static final int PPC_INS_VMSUMSHS = 347;
	public static final int PPC_INS_VMSUMUBM = 348;
	public static final int PPC_INS_VMSUMUHM = 349;
	public static final int PPC_INS_VMSUMUHS = 350;
	public static final int PPC_INS_VMULESB = 351;
	public static final int PPC_INS_VMULESH = 352;
	public static final int PPC_INS_VMULEUB = 353;
	public static final int PPC_INS_VMULEUH = 354;
	public static final int PPC_INS_VMULOSB = 355;
	public static final int PPC_INS_VMULOSH = 356;
	public static final int PPC_INS_VMULOUB = 357;
	public static final int PPC_INS_VMULOUH = 358;
	public static final int PPC_INS_VNMSUBFP = 359;
	public static final int PPC_INS_VNOR = 360;
	public static final int PPC_INS_VOR = 361;
	public static final int PPC_INS_VPERM = 362;
	public static final int PPC_INS_VPKPX = 363;
	public static final int PPC_INS_VPKSHSS = 364;
	public static final int PPC_INS_VPKSHUS = 365;
	public static final int PPC_INS_VPKSWSS = 366;
	public static final int PPC_INS_VPKSWUS = 367;
	public static final int PPC_INS_VPKUHUM = 368;
	public static final int PPC_INS_VPKUHUS = 369;
	public static final int PPC_INS_VPKUWUM = 370;
	public static final int PPC_INS_VPKUWUS = 371;
	public static final int PPC_INS_VREFP = 372;
	public static final int PPC_INS_VRFIM = 373;
	public static final int PPC_INS_VRFIN = 374;
	public static final int PPC_INS_VRFIP = 375;
	public static final int PPC_INS_VRFIZ = 376;
	public static final int PPC_INS_VRLB = 377;
	public static final int PPC_INS_VRLH = 378;
	public static final int PPC_INS_VRLW = 379;
	public static final int PPC_INS_VRSQRTEFP = 380;
	public static final int PPC_INS_VSEL = 381;
	public static final int PPC_INS_VSL = 382;
	public static final int PPC_INS_VSLB = 383;
	public static final int PPC_INS_VSLDOI = 384;
	public static final int PPC_INS_VSLH = 385;
	public static final int PPC_INS_VSLO = 386;
	public static final int PPC_INS_VSLW = 387;
	public static final int PPC_INS_VSPLTB = 388;
	public static final int PPC_INS_VSPLTH = 389;
	public static final int PPC_INS_VSPLTISB = 390;
	public static final int PPC_INS_VSPLTISH = 391;
	public static final int PPC_INS_VSPLTISW = 392;
	public static final int PPC_INS_VSPLTW = 393;
	public static final int PPC_INS_VSR = 394;
	public static final int PPC_INS_VSRAB = 395;
	public static final int PPC_INS_VSRAH = 396;
	public static final int PPC_INS_VSRAW = 397;
	public static final int PPC_INS_VSRB = 398;
	public static final int PPC_INS_VSRH = 399;
	public static final int PPC_INS_VSRO = 400;
	public static final int PPC_INS_VSRW = 401;
	public static final int PPC_INS_VSUBCUW = 402;
	public static final int PPC_INS_VSUBFP = 403;
	public static final int PPC_INS_VSUBSBS = 404;
	public static final int PPC_INS_VSUBSHS = 405;
	public static final int PPC_INS_VSUBSWS = 406;
	public static final int PPC_INS_VSUBUBM = 407;
	public static final int PPC_INS_VSUBUBS = 408;
	public static final int PPC_INS_VSUBUHM = 409;
	public static final int PPC_INS_VSUBUHS = 410;
	public static final int PPC_INS_VSUBUWM = 411;
	public static final int PPC_INS_VSUBUWS = 412;
	public static final int PPC_INS_VSUM2SWS = 413;
	public static final int PPC_INS_VSUM4SBS = 414;
	public static final int PPC_INS_VSUM4SHS = 415;
	public static final int PPC_INS_VSUM4UBS = 416;
	public static final int PPC_INS_VSUMSWS = 417;
	public static final int PPC_INS_VUPKHPX = 418;
	public static final int PPC_INS_VUPKHSB = 419;
	public static final int PPC_INS_VUPKHSH = 420;
	public static final int PPC_INS_VUPKLPX = 421;
	public static final int PPC_INS_VUPKLSB = 422;
	public static final int PPC_INS_VUPKLSH = 423;
	public static final int PPC_INS_VXOR = 424;
	public static final int PPC_INS_WAIT = 425;
	public static final int PPC_INS_XOR = 426;
	public static final int PPC_INS_XORI = 427;
	public static final int PPC_INS_XORIS = 428;
	public static final int PPC_INS_BC = 429;
	public static final int PPC_INS_BCA = 430;
	public static final int PPC_INS_BCCTR = 431;
	public static final int PPC_INS_BCCTRL = 432;
	public static final int PPC_INS_BCLA = 433;
	public static final int PPC_INS_BCLR = 434;
	public static final int PPC_INS_BCLRL = 435;
	public static final int PPC_INS_MAX = 436;

	// Group of PPC instructions

	public static final int PPC_GRP_INVALID = 0;
	public static final int PPC_GRP_ALTIVEC = 1;
	public static final int PPC_GRP_MODE32 = 2;
	public static final int PPC_GRP_MODE64 = 3;
	public static final int PPC_GRP_BOOKE = 4;
	public static final int PPC_GRP_NOTBOOKE = 5;
	public static final int PPC_GRP_JUMP = 6;
	public static final int PPC_GRP_MAX = 7;
}