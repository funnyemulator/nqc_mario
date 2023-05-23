�GSN    �˅1��\7,5V'Y 6Nh &[7��H�ah�,yQ�Ű?s@Ł����'��v�y8�h9(/�}R2Q���wt�X1�Ѫ�-Y�>����ۜk�ş�5&�fG�}a�:�vu���[A�W�p�8:�v�8�Kf�����~���cW������x����Ae�܆��@s�Q����s#-�e)�b豺рݟ%����:��{o'��������K�+a9-~�����;~H�����5~!.XF������~+��#A��z�SL^�\�����X	��x�*ε�� Ǖ��z�3�Y�a��Zx��7�0YTt�s:#��s����ba�&���(,�Rz�`��<|���]�"�Q����vM��(Z��������JS,���<\)�w2��_���G��T��x�$�L��9��51B��B��4�Ē��� L��m�@8[p�r�ܑ��~�Ż������y�щĿvCh1�&�4�m�d*BV ̃���Ratrix,CC_MVMatrix) , vec4(a_position.xyz, 1.0));
    v_fragmentColor = a_color0;
    v_texCoord = a_texcoord0;
}



#end�f

#ifdef FS
$input v_fragmentColor, v_texCoord

#include "../Library/Base/common.sh"

uniform mat4 CC_PMatrix;
uniformsmat4 CC_MultiViewPMatrix[4];
uniform mat4 CC_MVMatrix;
uniform mat4 CC_MVPMatrix;
uniform mat4 CC_MultiViewMVPMatrix[4];
un�form mat3 CC_NormalMatrix;
uniform vec4 CC_Time;
uniform vec4 CC_SinTime;
uniform vec4 CC_CosTime;
uniform vec4 CC_Random01A

SAMPLER2D (CC_Texture0,0);

uniform vec4 u_effectColor;
uniform vec4 u_textColor;


void main()
{
    // gl_FragColr = v_fragmentColor * texture2D(CC_Texture0, v_texCoord);

    float dist = texture2D(CC_Texture0, v_texCoord).a;
    //TODO� Implementation 'fwidth' for glsl 1.0
    //float width = fwidth(dist);
    //assign width for constant will lead to a littleLbit fuzzy,it's temporary measure.
    float width = 0.04;
    float alpha = smoothstep(0.5-width, 0.5+width, dist);
    //gl�w
    float mu = smoothstep(0.5, 1.0, sqrt(dist));
    vec4 color = u_effectColor*(1.0-alpha) + u_textColor*alpha;
    gl_Fr�gColor = v_fragmentColor * vec4(color.rgb, max(alpha,mu)*color.a);
}


#endif
