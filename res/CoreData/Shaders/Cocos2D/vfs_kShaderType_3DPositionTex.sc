�GSN    �˅1��\7,5V'Y 6Nh &[7��H�ah�,yQ�Ű?s@Ł����*��e�y8�h9(/�}@%H>���9g��x�עU�#B�HpV�_���Ϛa����h`�Wu�]a�|�M�ʙFN%	� �6]"�>�^N�[�Lj�����a�k��1�ڣ���mщ��,��3��@J:�)��W8-��Z	W�,%́�����%D��g��:��tV/�ԑ�����2~�sHkv��α��oa@�����qd=*_E������v�f��v�hHI���ݩ�[�� �dѶ�ms��V\�a�E�*n��!��j�hf�x~�%�!����mc�p����n �`�v��q7Uۍ�P� �����HN�=,�<P������27���<Sh�4p��^΄�b��R��x�k���;��\1l��F��=������%-���\8E$��{��ӕL�Ų]����{Ի�L7Z���ťyXs3�pZ�mT�l�oZ+^O%Ɔ���v
uniform mat4 u_viewProjMatrix;

void main()
{
    gl_Position = mul(mul(u_viewProj,CC_MVMatrix) , vec4(a_position.xyz, 1.�));
    v_texCoord = a_texcoord0;
    v_texCoord.y = 1.0 - v_texCoord.y;

    vec3 _normalVector = a_normal;
}



#end:f

#ifdef FS
$input v_texCoord

#include "../Library/Base/common.sh"

uniform mat4 CC_PMatrix;
uniform mat4 CC_MultiVie�PMatrix[4];
uniform mat4 CC_MVMatrix;
uniform mat4 CC_MVPMatrix;
uniform mat4 CC_MultiViewMVPMatrix[4];
uniform mat3 CC_NoralMatrix;
uniform vec4 CC_Time;
uniform vec4 CC_SinTime;
uniform vec4 CC_CosTime;
uniform vec4 CC_Random01;

SAMPLER2D (C-_Texture0,0);

uniform vec4 u_color;


void main()
{
    gl_FragColor = vec4(texture2D(CC_Texture0, v_texCoord).rgb,1.0)�
}


#endif
