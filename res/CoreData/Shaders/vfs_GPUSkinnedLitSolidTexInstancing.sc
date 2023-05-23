�GSN    �˅1��\7,5V'pcw2toT��6�6e�$<غ�$^h����t�&�N��b�p<�N%�5py|pj���Rv��!B1��!�u�'aQ����ؕpՀ��$HH�zL�hC��J���WA�W�(?g�2+�W4��lD�����o�;Z��"4�壜�C������*��M8�`����5W#*��pP�a(Έ�鵰�9��{�� ��BN;�؋Ȣ���=o�"5(^,հᐠ�Su����s�{;BMM�걀��X��;P��1N�A~b�q�����d$��)�o޹� ׃��)V�q�x�8U��gc]�� �ygR�xNh������Ro�2���Q�d�/4�ϴ~[gI恚[�m�I����0 �sc�=F����P����n^k\ރx�=m�7x�2�x���!��n5��.���;��!k31m��"��<���0���(\��u�q>N&��j�������Z����ޡ�
Tk��Ӌ�?!}�h\�,
�"�aP-|R0�����0PositionFinal.glsl"
     #include "Library/Macro/NormalFinal.glsl"
     #include "Library/Macro/Texcoord0Final.glsl"
     #i�clude "Library/Macro/ShadowCoordFinal.glsl"

    //gl_Position =  mul(u_modelViewProj , vec4(a_position.xy,1.0,1.0));
}
#en7if

#ifdef FS

/// input
#define USING_INOUT_NORMAL
#define USING_INOUT_TEXCOORD0
#define USING_INOUT_SHADOWCOORD
#defi�e USING_INOUT_FRAGPOS
#include "Library/Varying.glsl"

/// Common (uniforms,samplers, transforms ... )
//#define RECEIVED_S2ADOW
#include "Library/Common.glsl"
#include "Library/Lighting.glsl"

void main()
{
    vec4 texColor = texture2D(u_diffueTex,v_texcoord0);
    vec3 environmentColor = GetEnvironmentColor(v_normal);
    vec3 lightColor = GetLightColor(v_normal);�
    gl_FragColor = vec4((environmentColor + lightColor) * texColor.rgb,1.0);
}

#endif
