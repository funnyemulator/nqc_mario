�GSN    �˅1��\7,5V'pc|Ws$sNH��K�fh�+:���($CŁ�� �!�+��5�TtC�x*24�9J���@MnӲi;�ʽ�b@�Zr�{����xɎ��z%�K{�Ed�h� `�˅@F�5�3��m[�9�/	��ǐ�j�2��i�ԁ���t����NH��7��S^w�����E:93��7m8�ʚ����K�Q��)��p +������g�5|(@h�����",L��ف�`FsH�����G~��`��^v�j
�v�����_6��}�\��r:��ٶM�K�E�u��ZMz��@�,TdU�|������q`�-��_�m�-z�L��<|���]�"�Q����vM�� Z������)*���:H+�B��y���S��R��x�k���;��-m1K͋��_�{��=���:aS��,�m'J.�(�b����z×�?����>ڮ�MqH�����?!~�j`�6�i�fb=M<�ܤ��Sj_viewProjMatrix,CC_MVMatrix) , vec4(a_position.xyz,1.0));
	v_light = a_color0;
	v_dark = a_color1;
	v_texCoord = a_texcoord0�

}

#endif



#ifdef FS
$input v_texCoord, v_light, v_dark

#include "../Library/Base/common.sh"

uniform mat4 CCPMatrix;
uniform mat4 CC_MultiViewPMatrix[4];
uniform mat4 CC_MVMatrix;
uniform mat4 CC_MVPMatrix;
uniform mat4 CC_MultiVie�MVPMatrix[4];
uniform mat3 CC_NormalMatrix;
uniform vec4 CC_Time;
uniform vec4 CC_SinTime;
uniform vec4 CC_CosTime;
unifor vec4 CC_Random01;

SAMPLER2D (CC_Texture0,0);

void main()
{
	vec4 texColor = texture2D(CC_Texture0, v_texCoord);
	floa alpha = texColor.a * v_light.a;
	gl_FragColor.a = alpha;
	gl_FragColor.rgb = (1.0 - texColor.rgb) * v_dark.rgb * alpha + tex�olor.rgb * v_light.rgb;

}

#endif
